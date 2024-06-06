import java.util.Objects;
/**
 * Класс, представляющий упаковку товара.
 */
public class Packaged {

    private String namePackaged;
    private double weightPackaged;

    public Packaged(String namePackaged, double weightPackaged) {
        this.namePackaged = namePackaged;
        this.weightPackaged = weightPackaged;
    }

    public String getNamePackaged() {
        return namePackaged;
    }

    public void setNamePackaged(String namePackaged) {
        this.namePackaged = namePackaged;
    }

    public double getWeightPackaged() {
        return weightPackaged;
    }

    public void setWeightPackaged(double weightPackaged) {
        this.weightPackaged = weightPackaged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packaged packaged = (Packaged) o;
        return Double.compare(packaged.weightPackaged, weightPackaged) == 0 &&
                Objects.equals(namePackaged, packaged.namePackaged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePackaged, weightPackaged);
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "name='" + namePackaged + '\'' +
                ", weight=" + weightPackaged +
                '}';
    }
}