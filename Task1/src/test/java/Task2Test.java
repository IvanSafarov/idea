import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {

    @Test
    public void testOperationsNumbersDouble() {
        // Создаем строку ввода с данными для метода main.
        String inputData = "1,2\n2,3\n3,4";
        InputStream originalIn = System.in;

        // Перенаправляем стандартный ввод на строку с данными.
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        // Перенаправляем стандартный вывод в буфер для сбора вывода метода main.
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        // Вызываем метод main класса Task2.
        Task2.operationsNumbersDouble(null);

        // Восстанавливаем стандартный ввод.
        System.setIn(originalIn);

        // Восстанавливаем стандартный вывод.
        System.setOut(originalOut);

        // Получаем вывод метода main из буфера.
        String actualOutput = output.toString();

        // Проверяем соответствие вывода ожидаемому значению.
        String expectedOutput = "9.384\n2.3\n1.2 2.3 3.4\n";
        assertEquals(expectedOutput, actualOutput);
    }
}

