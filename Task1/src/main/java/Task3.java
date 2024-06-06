import java.util.Scanner;
import java.text.DecimalFormat;

public class Task3 {
    public static void operationsNumbersInt(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in); // Инициализируем считывание с клавиатуры
        x = scanner.nextInt(); // Считывание целого числа
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println(x * y * z);  // Произведение
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format((double)(x + y + z) / 3.0));// Среднее арифметическое
        // Узнаём, как числа идут в порядке возрастания
        if (x >= y && x >= z) {
            if (y >= z) {
                System.out.println(z + " " + y + " " + x);
            } else {
                System.out.println(y + " " + z + " " + x);
            }
        } else if (y >= z) {
            if (x >= z) {
                System.out.println(z + " " + x + " " + y);

            } else {
                System.out.println(x + " " + z + " " + y);
            }
        } else {
            if (x >= y) {
                System.out.println(y + " " + x + " " + z);
            } else {
                System.out.println(x + " " + y + " " + z);
            }
        }
    }
}
