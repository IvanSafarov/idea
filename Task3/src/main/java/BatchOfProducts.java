/**
 * Класс, представляющий партию товаров.
 */
import java.util.List;

public class BatchOfProducts {

    private String descriptionBatch;
    private List<PackagedProduct> products;

    public BatchOfProducts(String descriptionBatch, List<PackagedProduct> products) {
        this.descriptionBatch = descriptionBatch;
        this.products = products;
    }

    public String getDescription() {
        return descriptionBatch;
    }

    public void setDescription(String description) {
        this.descriptionBatch = description;
    }

    public List<PackagedProduct> getProducts() {
        return products;
    }

    public void setProducts(List<PackagedProduct> products) {
        this.products = products;
    }

    public double getTotalGrossWeight() {
        double totalGrossWeight = 0;
        for (PackagedProduct product : products) {
            if (product instanceof PackagedWeightedProduct) {
                totalGrossWeight += ((PackagedWeightedProduct) product).getNetWeight();
            } else if (product instanceof PackagedPieceProduct) {
                totalGrossWeight += ((PackagedPieceProduct) product).getNetWeight();
            } else if (product instanceof PackagedSetProduct) {
                totalGrossWeight += ((PackagedSetProduct) product).getNetWeightSet();
            }
        }
        return totalGrossWeight;
    }
}
