import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task1Test {

    @Test
    public void testSayHello() {
        // Перенаправление стандартного вывода в буфер для сбора вывода метода main.
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        // Вызов метода main класса Task1.
        Task1.sayHello(null);

        // Восстановление стандартного вывода.
        System.setOut(originalOut);

        // Получение вывода метода main из буфера.
        String actualOutput = output.toString();

        // Проверка соответствия вывода ожидаемому значению.
        String expectedOutput = "Hello world!" + System.lineSeparator();
        assertEquals(expectedOutput, actualOutput);
    }
}