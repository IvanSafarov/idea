import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void testOutputArray() {
        // Проверка вывода массива на экран
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Array array = new Array(5);
        array.setArray(new int[]{1, 2, 3, 4, 5});
        array.outputArray();
        System.setOut(originalOut);
        String expectedOutput = "1\n2\n3\n4\n5";
        assertEquals(expectedOutput, outContent.toString());
    }


    @Test
    void testInputArray() {
        // Проверка считывания массива с клавиатуры
        Array array = new Array(5);
        int[] inputArray = {1, 2, 3, 4, 5};
        array.inputArray(inputArray);
        assertArrayEquals(inputArray, array.getArray());
    }

    @Test
    void testSumArray() {
        // Проверка суммы чисел массива
        Array array = new Array(5);
        array.setArray(new int[]{1, 2, 3, 4, 5});
        long expectedSum = 15;
        assertEquals(expectedSum, array.sumArray());
    }

    @Test
    void testAllPositive() {
        // Проверка, все ли числа в массиве положительные
        Array array = new Array(5);
        array.setArray(new int[]{1, 2, 3, 4, 5});
        assertTrue(array.allPositive());
    }

    @Test
    void testReverse() {
        // Проверка реверса массива
        Array array = new Array(5);
        array.setArray(new int[]{1, 2, 3, 4, 5});
        array.reverse();
        int[] expectedArray = {5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, array.getArray());
    }

    @Test
    void testSegment() {
        // Проверка количества чисел, принадлежащих отрезку [a, b]
        Array array = new Array(5);
        array.setArray(new int[]{1, 2, 3, 4, 5});
        int a = 2;
        int b = 4;
        int expectedCount = 3;
        assertEquals(expectedCount, array.segment(a, b));
    }

    @Test
    void testEvenNumbers() {
        // Проверка количества чётных чисел в массиве
        Array array = new Array(5);
        array.setArray(new int[]{1, 2, 3, 4, 5});
        int expectedEvenCount = 2;
        assertEquals(expectedEvenCount, array.evenNumbers());
    }
}
