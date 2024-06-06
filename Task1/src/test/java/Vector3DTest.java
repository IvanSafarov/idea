import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector3DTest {

    @Test
    void testDefaultConstructor() {
        // Проверка конструктора без параметров (создает нулевой вектор)
        Vector3D vector = new Vector3D();
        Assertions.assertEquals(0, vector.getP().getX());
        Assertions.assertEquals(0, vector.getP().getY());
        Assertions.assertEquals(0, vector.getP().getZ());
    }

    @Test
    void testConstructorWithCoordinates() {
        // Проверка конструктора по координатам
        Vector3D vector = new Vector3D(1, 2, 3);
        Assertions.assertEquals(1, vector.getP().getX());
        Assertions.assertEquals(2, vector.getP().getY());
        Assertions.assertEquals(3, vector.getP().getZ());
    }

    @Test
    void testConstructorWithPoints() {
        // Проверка конструктора по двум точкам (Point3D)
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(4, 5, 6);
        Vector3D vector = new Vector3D(p1, p2);
        Assertions.assertEquals(3, vector.getP().getX());
        Assertions.assertEquals(3, vector.getP().getY());
        Assertions.assertEquals(3, vector.getP().getZ());
    }

    @Test
    void testVectorLength() {
        // Проверка длины вектора
        Vector3D vector = new Vector3D(3, 4, 5);
        Assertions.assertEquals(Math.sqrt(50), vector.vectorLength(), 0.001);
    }

    @Test
    void testEquality() {
        // Проверка равенства с заданным вектором
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(1, 2, 3);
        Assertions.assertEquals(vector1, vector2);
    }

    @Test
    void testInequality() {
        // Проверка неравенства с заданным вектором
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);
        Assertions.assertNotEquals(vector1, vector2);
    }
}
