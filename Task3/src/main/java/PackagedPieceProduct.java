/**
 * Класс, представляющий упакованный штучный товар.
 */
public class PackagedPieceProduct extends PackagedProduct {

    private double weightProduct;
    private int quantity;

    public PackagedPieceProduct(String nameProduct, String descriptionProduct, Packaged packaged, double weightProduct, int quantity) {
        super(nameProduct, descriptionProduct, packaged);
        this.weightProduct = weightProduct;
        this.quantity = quantity;
    }

    public double getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(double weightProduct){
        this.weightProduct = weightProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getNetWeight() {
        return quantity * getWeightProduct();
    }

    public double getGrossWeight() {
        return getNetWeight() + getWeightPackagedProduct();
    }
}

