import java.math.BigDecimal;
import java.util.Scanner;

public class Task2 {
    public static void operationsNumbersDouble(String[] args) {
        BigDecimal x, y, z;
        Scanner scanner = new Scanner(System.in); // Инициализируем считывание с клавиатуры
        x = scanner.nextBigDecimal(); // Считывание вещественного числа
        y = scanner.nextBigDecimal();
        z = scanner.nextBigDecimal();
        System.out.println(x.multiply(y).multiply(z));  // Произведение
        System.out.println((x.add(y).add(z)).divide(BigDecimal.valueOf(3.0))); // Среднее арифметическое
        // Узнаём, как числа идут в порядке возрастания
        if (x.compareTo(y) >= 0 && x.compareTo(z) >= 0) {
            if (y.compareTo(z) >= 0) {
                System.out.println(z + " " + y + " " + x);
            } else {
                System.out.println(y + " " + z + " " + x);
            }
        } else if (y.compareTo(z) >= 0) {
            if (x.compareTo(z) >= 0) {
                System.out.println(z + " " + x + " " + y);

            } else {
                System.out.println(x + " " + z + " " + y);
            }
        } else {
            if (x.compareTo(y) >= 0) {
                System.out.println(y + " " + x + " " + z);
            } else {
                System.out.println(x + " " + y + " " + z);
            }
        }
    }
}