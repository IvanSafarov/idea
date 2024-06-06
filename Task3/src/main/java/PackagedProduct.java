import java.util.Objects;
/**
 * Класс, представляющий упакованный товар.
 */
public class PackagedProduct extends Product {

    private Packaged packagedProduct;

    public PackagedProduct(String nameProduct, String descriptionProduct, Packaged packagedProduct) {
        super(nameProduct, descriptionProduct);
        this.packagedProduct = packagedProduct;
    }

    public String getNameProduct() {
        return super.getNameProduct();
    }

    public void setNameProduct(String nameProduct) {
        super.setNameProduct(nameProduct);
    }

    public String getDescriptionProduct() {
        return super.getDescriptionProduct();
    }

    public void setDescriptionProduct(String descriptionProduct) {
        super.setDescriptionProduct(descriptionProduct);
    }

    public String getNamePackagedProduct() {
        return packagedProduct.getNamePackaged();
    }

    public void setNamePackagedProduct(String namePackaged) {
        packagedProduct.setNamePackaged(namePackaged);
    }

    public double getWeightPackagedProduct() {
        return packagedProduct.getWeightPackaged();
    }

    public void setWeightPackaged(double weightPackaged) {
        packagedProduct.setWeightPackaged(weightPackaged);
    }
}