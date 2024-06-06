import java.util.Objects;

/**
 * Класс, представляющий штучный товар.
 */
public class PieceProduct extends Product {
    private double weightPieceProduct;

    public PieceProduct(String namePrduct, String descriptionProduct, double weightPieceProduct) {
        super(namePrduct, descriptionProduct);
        this.weightPieceProduct = weightPieceProduct;
    }

    public double getWeightPieceProduct() {
        return weightPieceProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceProduct that = (PieceProduct) o;
        return Double.compare(that.weightPieceProduct, weightPieceProduct) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weightPieceProduct);
    }

    @Override
    public String toString() {
        return "PieceProduct{" +
                "name='" + getNameProduct() + '\'' +
                ", description='" + getDescriptionProduct() + '\'' +
                ", weight=" + weightPieceProduct +
                '}';
    }
}