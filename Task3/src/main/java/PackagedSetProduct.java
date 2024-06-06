import java.util.List;
/**
 * Класс, представляющий упакованный набор товаров.
 */
public class PackagedSetProduct extends PackagedProduct {

    private List<PackagedProduct> setProducts;
    private Packaged packagedSetProduct;
    private String setName; // Новое поле "название набора упакованных продуктов"

    public PackagedSetProduct(List<PackagedProduct> setProducts, Packaged packagedSetProduct, String setName) {
        super(null, null, null);
        this.setProducts = setProducts;
        this.packagedSetProduct = packagedSetProduct;
        this.setName = setName; // Инициализация нового поля
    }

    public List<PackagedProduct> getSetProducts() {
        return setProducts;
    }

    public void setSetProducts(List<PackagedProduct> setProducts) {
        this.setProducts = setProducts;
    }

    public String getSetName() { // Геттер для нового поля
        return setName;
    }

    public void setSetName(String setName) { // Сеттер для нового поля
        this.setName = setName;
    }

    public double getNetWeightSet() {
        double netWeight = 0;
        for (PackagedProduct product : setProducts) {
            if (product instanceof PackagedWeightedProduct) {
                netWeight += ((PackagedWeightedProduct) product).getNetWeight();
            } else if (product instanceof PackagedPieceProduct) {
                netWeight += ((PackagedPieceProduct) product).getNetWeight();
            } else if (product instanceof PackagedSetProduct) {
                netWeight += ((PackagedSetProduct) product).getNetWeightSet();
            }
        }
        return netWeight;
    }

    public double getGrossWeight() {
        return getNetWeightSet() + packagedSetProduct.getWeightPackaged();
    }
}

/*
пример
PackagedProduct packagedProduct1 = new PackagedWeightedProduct("Яблоки", "Сочные южные зеленые яблоки", packaged1, 1.5);
тут у packaged типа Packaged есть свое название и свой вес, тоесть в коде это выглядит так Packaged packaged1 = new Packaged("Картонная коробка", 2.4)
PackagedProduct packagedProduct2 = new PackagedPieceProduct("Бутылки", "Бутылки с водой питьевой", packaged2, 3.2, 25);
Packaged packaged2 = new Packaged("Пластиковый контейнер", 4.1)
PackagedProduct setProduct1 = new PackagedSetProduct(List.of(packagedProduct1, packagedProduct2, List.of(packagedProduct1, packagedProduct1)), new Packaged("Коробка", 0.5));

// Вывод:
System.out.println("Вес набора: " + setProduct1.getNetWeightSet()); // 84.5 кг
System.out.println("Брутто-вес набора: " + setProduct1.getGrossWeightSet()); // 96.3 кг


 */