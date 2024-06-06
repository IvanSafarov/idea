import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Point3DTest {

    // Тест проверяет, что конструктор с координатами правильно устанавливает значения x, y и z
    @Test
    void testConstructorWithCoordinates() {
        Point3D point = new Point3D(1, 2, 3);
        Assertions.assertEquals(1, point.getX());
        Assertions.assertEquals(2, point.getY());
        Assertions.assertEquals(3, point.getZ());
    }

    // Тест проверяет, что конструктор без аргументов правильно устанавливает значения x, y и z в 0
    @Test
    void testConstructorWithoutCoordinates() {
        Point3D point = new Point3D();
        Assertions.assertEquals(0, point.getX());
        Assertions.assertEquals(0, point.getY());
        Assertions.assertEquals(0, point.getZ());
    }

    // Тест проверяет, что методы получения и установки координат работают правильно
    @Test
    void testGetterAndSetter() {
        Point3D point = new Point3D();
        point.setX(4);
        point.setY(5);
        point.setZ(6);
        Assertions.assertEquals(4, point.getX());
        Assertions.assertEquals(5, point.getY());
        Assertions.assertEquals(6, point.getZ());
    }

    // Тест проверяет, что два объекта Point3D с одинаковыми координатами считаются равными
    @Test
    void testEquality() {
        Point3D point1 = new Point3D(1, 2, 3);
        Point3D point2 = new Point3D(1, 2, 3);

        Assertions.assertEquals(point1.getX(), point2.getX());
        Assertions.assertEquals(point1.getY(), point2.getY());
        Assertions.assertEquals(point1.getZ(), point2.getZ());
    }

    // Тест проверяет, что два объекта Point3D с разными координатами считаются неравными
    @Test
    void testInequality() {
        Point3D point1 = new Point3D(1, 2, 3);
        Point3D point2 = new Point3D(4, 5, 6);
        Assertions.assertNotEquals(point1, point2);
    }

    // Тест проверяет, что объект Point3D считается равным самому себе
    @Test
    void testSelfEquality() {
        Point3D point = new Point3D(1, 2, 3);
        Assertions.assertEquals(point, point);
    }

    // Тест проверяет, что метод printPoint3D() выводит правильные координаты в консоль
    @Test
    void testPrintPoint3D() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Point3D point = new Point3D(1, 2, 3);
        point.printPoint3D();

        String expectedOutput = "x: 1.0, y: 2.0, z: 3.0" + System.lineSeparator();
        Assertions.assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out); // Восстанавливаем стандартный вывод в консоль
    }
}