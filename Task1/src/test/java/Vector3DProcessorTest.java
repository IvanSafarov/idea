import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector3DProcessorTest {

    // Тест проверяет, что сумма двух векторов вычисляется правильно
    @Test
    void testVectorsSum() {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);
        Vector3D expectedResult = new Vector3D(5, 7, 9);
        Vector3D actualResult = Vector3DProcessor.vectorsSum(vector1, vector2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Тест проверяет, что разность двух векторов вычисляется правильно
    @Test
    void testVectorsRazn() {
        Vector3D vector1 = new Vector3D(10, 20, 30);
        Vector3D vector2 = new Vector3D(4, 5, 6);
        Vector3D expectedResult = new Vector3D(6, 15, 24);
        Vector3D actualResult = Vector3DProcessor.vectorsRazn(vector1, vector2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Тест проверяет, что скалярное произведение двух векторов вычисляется правильно
    @Test
    void testVectorsSkal() {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);
        double expectedResult = 32.0;
        double actualResult = Vector3DProcessor.vectorsSkal(vector1, vector2);
        Assertions.assertEquals(expectedResult, actualResult, 0.0001);
    }

    // Тест проверяет, что векторное произведение двух векторов вычисляется правильно
    @Test
    void testVectorsVekt() {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);
        Vector3D expectedResult = new Vector3D(-3, 6, -3);
        Vector3D actualResult = Vector3DProcessor.vectorsVekt(vector1, vector2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Тест проверяет, что коллинеарность двух векторов определяется правильно
    @Test
    void testVectorsColl() {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(2, 4, 6);
        boolean expectedResult = true;
        boolean actualResult = Vector3DProcessor.vectorsColl(vector1, vector2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Тест проверяет, что неколлинеарность двух векторов определяется правильно
    @Test
    void testVectorsNotColl() {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);
        boolean expectedResult = false;
        boolean actualResult = Vector3DProcessor.vectorsColl(vector1, vector2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
