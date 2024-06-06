import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringProcessorTest {

    // Тест для метода multiplyString, который должен возвращать строку, состоящую из N копий исходной строки
    @Test
    void testMultiplyString() {
        // Проверяем, что с пустой строкой и 0 в качестве входных данных возвращается пустая строка
        Assertions.assertEquals("", StringProcessor.multiplyString("", 0));
        // Проверяем, что с непустой строкой и положительным числом возвращается ожидаемый результат
        Assertions.assertEquals("aaa", StringProcessor.multiplyString("a", 3));
        // Проверяем, что с отрицательным числом выбрасывается IllegalArgumentException
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProcessor.multiplyString("a", -1));
    }

    // Тест для метода countSubstring, который должен считать количество вхождений второй строки в первую
    @Test
    void testCountSubstring() {
        // Проверяем, что подстрока, присутствующая в строке, находится правильно
        Assertions.assertEquals(2, StringProcessor.countSubstring("Hello, World! Hello!", "Hello"));
        // Проверяем, что подстрока, отсутствующая в строке, находится правильно
        Assertions.assertEquals(0, StringProcessor.countSubstring("Hello, World!", "hey"));
        // Проверяем, что с пустой подстрокой выбрасывается IllegalArgumentException
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProcessor.countSubstring("Hello, World!", ""));
        // Проверяем, что с null подстрокой выбрасывается IllegalArgumentException
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProcessor.countSubstring("Hello, World!", null));
    }

    // Тест для метода replaceDigits, который должен заменять цифры на соответствующие слова
    @Test
    void testReplaceDigits() {
        // Проверяем, что строка с цифрами преобразуется правильно
        Assertions.assertEquals("одиндватри", StringProcessor.replaceDigits("123"));
        // Проверяем, что строка с цифрами и другими символами преобразуется правильно
        Assertions.assertEquals("Hello, World! одиндватри", StringProcessor.replaceDigits("Hello, World! 123"));
        // Проверяем, что пустая строка преобразуется правильно
        Assertions.assertEquals("", StringProcessor.replaceDigits(""));
    }

    // Тест для метода deleteEverySecondChar, который должен удалять каждый второй символ в строке
    @Test
    void testDeleteEverySecondChar() {
        // Проверяем работу метода с объектом StringBuilder
        StringBuilder sb = new StringBuilder("abcdef");
        StringProcessor.deleteEverySecondChar(sb);
        Assertions.assertEquals("ace", sb.toString());

        // Проверяем работу метода с другим объектом StringBuilder
        sb = new StringBuilder("abcdef");
        StringProcessor.deleteEverySecondChar(sb);
        Assertions.assertEquals("ace", sb.toString());
    }

    // Тест для метода reverseWords, который должен реверсировать слова в строке
    @Test
    void testReverseWords() {
        // Проверяем работу метода со строкой, содержащей слова
        Assertions.assertEquals("d c bbb aaa", StringProcessor.reverseWords("aaa bbb c d"));
        // Проверяем работу метода со строкой, содержащей несколько пробелов между словами
        Assertions.assertEquals("d c bbb aaa", StringProcessor.reverseWords("  aaa   bbb   c   d  "));
        // Проверяем работу метода с пустой строкой
        Assertions.assertEquals("", StringProcessor.reverseWords(""));
    }

    // Тест для метода replaceHexToDecimal, который должен заменять шестнадцатеричные числа на десятичные
    @Test
    void testReplaceHexToDecimal() {
        // Проверяем работу метода со строкой, содержащей шестнадцатеричное число
        Assertions.assertEquals("Васе 0x10 16 лет", StringProcessor.replaceHexToDecimal("Васе 0x00000010 лет"));
        // Проверяем работу метода со строкой, содержащей большое шестнадцатеричное число
        Assertions.assertEquals("Привет 0xFFFFFFFF 4294967295", StringProcessor.replaceHexToDecimal("Привет 0xFFFFFFFF"));
        // Проверяем работу метода со строкой, содержащей несколько шестнадцатеричных чисел
        Assertions.assertEquals("Цифры 0x1 1 0x2A 42 0xFF 255", StringProcessor.replaceHexToDecimal("Цифры 0x1 0x2A 0xFF"));
    }

}

