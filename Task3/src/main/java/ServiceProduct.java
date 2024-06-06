import java.util.List;
/**
 Класс СервисТоваров, для работы с партией товаров
 * */
public class ServiceProduct {

    // Подсчитать количество элементов партии, имена которых удовлетворяют фильтру
    public int countByFilter(BatchOfProducts batchOfProducts, Filter filter) {
        int count = 0;
        for (PackagedProduct product : batchOfProducts.getProducts()) {
            if (product instanceof PackagedSetProduct) {
                // Для наборов анализируем имя самого набора
                if (filter.apply(((PackagedSetProduct) product).getSetName())) {
                    count++;
                }
            } else {
                if (filter.apply(product.getNamePackagedProduct())) {
                    count++;
                }
            }
        }
        return count;
    }

    // Подсчитать количество элементов партии, имена которых удовлетворяют фильтру (включая вложенные наборы)
    public int countByFilterDeep(BatchOfProducts batchOfProducts, Filter filter) {
        int count = 0;
        for (PackagedProduct product : batchOfProducts.getProducts()) {
            if (product instanceof PackagedSetProduct) {
                // Для наборов анализируем название самого набора и всех вложенных продуктов
                if (filter.apply(product.getNamePackagedProduct())) {
                    count++;
                }
                count += countByFilterDeep(new BatchOfProducts("", ((PackagedSetProduct) product).getSetProducts()), filter);
            } else {
                if (filter.apply(product.getNamePackagedProduct())) {
                    count++;
                }
            }
        }
        return count;
    }

    // Проверить, что вся партия состоит только из весовых товаров
    public boolean checkAllWeighted(BatchOfProducts batchOfProducts) {
        for (PackagedProduct product : batchOfProducts.getProducts()) {
            if (!(product instanceof PackagedWeightedProduct)) {
                return false;
            }
        }
        return true;
    }
}
