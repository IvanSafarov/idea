import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task6Test {

    @Test
    void testNoSolutions() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Task6.systemTwoLinearEquationsReal(-3, 1, 0, 6, -2, -3);

        System.setOut(System.out);

        assertEquals("Решений нет\n", outContent.toString());
    }

    @Test
    void testInfiniteSolutions() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Task6.systemTwoLinearEquationsReal(2, 2, 0, 1, 1, 0);

        System.setOut(System.out);

        assertEquals("Бесконечное число решений\n", outContent.toString());
    }

    @Test
    void testUniqueSolution() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Task6.systemTwoLinearEquationsReal(1, 2, 3, 4, 5, 6);

        System.setOut(System.out);

        assertEquals("-1,0 2,0 Решение системы", outContent.toString());
    }
}

