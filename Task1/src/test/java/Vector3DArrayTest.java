import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Vector3DArrayTest {

    private Vector3DArray array;

    // Выполняется перед каждым тестом
    // Создаем новый экземпляр Vector3DArray с размером 5
    @BeforeEach
    void setUp() {
        array = new Vector3DArray(3);
    }

    // Проверяем, что длина массива равна 5
    @Test
    void testArrayLen() {
        assertEquals(3, array.arrayLen());
    }

    // Проверяем, что элемент массива был установлен корректно
    @Test
    void testSetElem() {
        Vector3D v = new Vector3D(1, 2, 3);
        array.setElem(0, v);
        assertEquals(v, array.getElem(0));
    }

    // Проверяем, что найдена максимальная длина вектора
    @Test
    void testMaxLen() {
        // Создаем 3 вектора и помещаем их в массив
        array.setElem(0, new Vector3D(1, 2, 3));
        array.setElem(1, new Vector3D(4, 5, 6));
        array.setElem(2, new Vector3D(7, 8, 9));

        // Вычисляем ожидаемое значение максимальной длины вектора
        double length1 = array.getElem(0).vectorLength();
        double length2 = array.getElem(1).vectorLength();
        double length3 = array.getElem(2).vectorLength();

        double expectedMaxLen = Math.max(length1, Math.max(length2, length3));

        // Получаем фактическое значение максимальной длины
        double actualMaxLen = array.maxLen();

        // Выводим ожидаемое и фактическое значения для проверки
        System.out.println("Expected: " + expectedMaxLen);
        System.out.println("Actual: " + actualMaxLen);

        // Сравниваем ожидаемое и фактическое значения с точностью до 0.001
        assertEquals(expectedMaxLen, actualMaxLen, 0.001);
    }

    // Проверяем, что вектор найден в массиве, и что невалидный вектор не найден
    @Test
    void testFindVector() {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);
        array.setElem(0, v1);
        array.setElem(1, v2);
        assertEquals(0, array.findVector(v1));
        assertEquals(1, array.findVector(v2));
        assertEquals(-1, array.findVector(new Vector3D(7, 8, 9)));
    }

    // Проверяем, что сумма векторов вычислена корректно
    @Test
    void testVectorsSum() {
        array.setElem(0, new Vector3D(1, 2, 3));
        array.setElem(1, new Vector3D(4, 5, 6));
        array.setElem(2, new Vector3D(7, 8, 9));
        Vector3D expected = new Vector3D(12, 15, 18);
        assertEquals(expected, array.vectorsSum());
    }

    // Проверяем, что линейная комбинация векторов вычислена корректно
    @Test
    void testVectorsComb() {
        array.setElem(0, new Vector3D(1, 2, 3));
        array.setElem(1, new Vector3D(4, 5, 6));
        array.setElem(2, new Vector3D(7, 8, 9));
        int[] coefficients = {1, 2, 3};
        Vector3D expected = new Vector3D(30, 36, 42);
        assertEquals(expected, array.vectorsComb(coefficients));
    }

    // Проверяем, что массив сдвинутых точек вычислен корректно
    @Test
    void testVectorsPoint() {
        array.setElem(0, new Vector3D(1, 2, 3));
        array.setElem(1, new Vector3D(4, 5, 6));
        array.setElem(2, new Vector3D(7, 8, 9));
        Point3D p = new Point3D(0, 0, 0);
        ArrayList<Point3D> actual = array.vectorsPoint(p);

        assertEquals(3, actual.size());

        Point3D expected0 = new Point3D(1, 2, 3);
        Point3D expected1 = new Point3D(4, 5, 6);
        Point3D expected2 = new Point3D(7, 8, 9);

        assertTrue(contains(actual, expected0));
        assertTrue(contains(actual, expected1));
        assertTrue(contains(actual, expected2));
    }

    private boolean contains(ArrayList<Point3D> list, Point3D point) {
        for (Point3D p : list) {
            if (p.getX() == point.getX() && p.getY() == point.getY() && p.getZ() == point.getZ()) {
                return true;
            }
        }
        return false;
    }

}