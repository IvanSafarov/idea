public class Vector3DProcessor {
    //Task17 in Vector3DProcessorTest
    // Метод возвращает новый вектор, который является суммой двух входных векторов
    public static Vector3D vectorsSum(Vector3D v1, Vector3D v2){
        return new Vector3D(v1.getP().getX() + v2.getP().getX(),
                v1.getP().getY() + v2.getP().getY(),
                v1.getP().getZ() + v2.getP().getZ());
    }

    // Метод возвращает новый вектор, который является разностью двух входных векторов
    public static Vector3D vectorsRazn(Vector3D v1, Vector3D v2){
        return new Vector3D(v1.getP().getX() - v2.getP().getX(),
                v1.getP().getY() - v2.getP().getY(),
                v1.getP().getZ() - v2.getP().getZ());
    }

    // Метод возвращает скалярное произведение двух входных векторов
    public static double vectorsSkal(Vector3D v1, Vector3D v2){
        return ((v1.getP().getX()) * (v2.getP().getX()) +
                (v1.getP().getY()) * (v2.getP().getY()) +
                (v1.getP().getZ()) * (v2.getP().getZ()));
    }

    // Метод возвращает новый вектор, который является векторным произведением двух входных векторов
    public static Vector3D vectorsVekt(Vector3D v1, Vector3D v2) {
        double x = v1.getP().getY() * v2.getP().getZ() - v1.getP().getZ() * v2.getP().getY();
        double y = v1.getP().getZ() * v2.getP().getX() - v1.getP().getX() * v2.getP().getZ();
        double z = v1.getP().getX() * v2.getP().getY() - v1.getP().getY() * v2.getP().getX();
        return new Vector3D(x, y, z);
    }

    // Метод проверяет, являются ли два входных вектора коллинеарными
    public static boolean vectorsColl(Vector3D v1, Vector3D v2){
        Vector3D v3 = vectorsVekt(v1, v2);
        return (v3.getP().getX() == 0&& v3.getP().getY() == 0&& v3.getP().getZ() == 0);
    }
}