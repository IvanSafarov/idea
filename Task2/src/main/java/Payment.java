import java.util.Objects;

public class Payment {
    private String name;
    private int date;
    private int month;
    private int year;
    private int sum;

    public Payment(String name, int date, int month, int year, int sum) {
        this.name = name;
        this.date = date;
        this.month = month;
        this.year = year;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getSum() {
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment payment)) return false;
        return getDate() == payment.getDate() && getMonth() == payment.getMonth() && getYear() == payment.getYear() && getSum() == payment.getSum() && getName().equals(payment.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getDate(), getMonth(), getYear(), getSum());
    }

    @Override
    public String toString() {
        return name + " " + date + " " + month + " " + year + " " + sum;
    }
}