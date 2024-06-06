/**
 * Класс, представляющий упакованный весовой товар.
 */
public class PackagedWeightedProduct extends PackagedProduct {

    private double weightOfWeightedProduct;

    public PackagedWeightedProduct(String nameWeightedProduct, String descriptionWeightedProduct, Packaged packaged, double weightOfWeightedProduct) {
        super(nameWeightedProduct, descriptionWeightedProduct, packaged);
        this.weightOfWeightedProduct = weightOfWeightedProduct;
    }

    public double getNetWeight() {
        return weightOfWeightedProduct;
    }

    public double getGrossWeight() {
        return weightOfWeightedProduct + getWeightPackagedProduct();
    }

    public void setWeightOfWeightedProduct(double weightOfWeightedProduct) {
        this.weightOfWeightedProduct = weightOfWeightedProduct;
    }
}