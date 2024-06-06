import java.util.ArrayList;

public class FinanceReport {
    private String name;
    private int date;
    private ArrayList<Payment> payments = new ArrayList<>();

    public FinanceReport(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public int getSize() {
        return payments.size();
    }

    public Payment getPayment(int index) {
        return payments.get(index);
    }

    public void setPayment(int index, Payment payment) {
        if (index < payments.size()) {
            payments.set(index, payment);
        } else {
            payments.add(payment);
        }
    }

    public FinanceReport copyPayments() {
        FinanceReport report2 = new FinanceReport(name, date);
        for (Payment p : payments) {
            report2.payments.add(new Payment(p.getName(), p.getDate(), p.getMonth(), p.getYear(), p.getSum()));
        }
        return report2;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(String.format("[Автор: %s, дата: %d, Платежи: [\n", name, date));
        for (Payment p : payments) {
            result.append(String.format("\tПлательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.\n",
                    p.getName(), p.getDate(), p.getMonth(), p.getYear(), p.getSum() / 100, p.getSum() % 100));
        }
        return result.append("]").toString();
    }
}
