import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FinanceReportProcessor {
    public static FinanceReport getPaymentsByName(FinanceReport report, char symbol) {
        FinanceReport result = new FinanceReport(report.getName(), report.getDate());
        for (int i = 0; i < report.getSize(); i++) {
            Payment p = report.getPayment(i);
            if (p.getName().charAt(0) == symbol) {
                result.setPayment(result.getSize(), p);
            }
        }
        return result;
    }

    public static FinanceReport getPaymentsBySumLessThan(FinanceReport report, int sum) {
        FinanceReport result = new FinanceReport(report.getName(), report.getDate());
        for (int i = 0; i < report.getSize(); i++) {
            Payment p = report.getPayment(i);
            if (p.getSum() < sum) {
                result.setPayment(result.getSize(), p);
            }
        }
        return result;
    }
    public static int getTotalPaymentsByDate(FinanceReport report, int date, int month, int year) {
        int total = 0;
        for (int i = 0; i < report.getSize(); i++) {
            Payment p = report.getPayment(i);
            if (p.getDate() == date && p.getMonth() == month && p.getYear() == year) {
                total += p.getSum();
            }
        }
        return total;
    }

    public static List<String> getMonthsWithoutPayments(FinanceReport report, int year) {
        Set<Integer> paymentMonths = new HashSet<>();
        for (int i = 0; i < report.getSize(); i++) {
            Payment p = report.getPayment(i);
            if (p.getYear() == year) {
                paymentMonths.add(p.getMonth());
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {

            if (!paymentMonths.contains(i)) {
                result.add(getMonthName(i));
            }
        }
        return result;
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1: return "Январь";
            case 2: return "Февраль";
            case 3: return "Март";
            case 4: return "Апрель";
            case 5: return "Май";
            case 6: return "Июнь";
            case 7: return "Июль";
            case 8: return "Август";
            case 9: return "Сентябрь";
            case 10: return "Октябрь";
            case 11: return "Ноябрь";
            case 12: return "Декабрь";
            default: return "";
        }
    }

        }