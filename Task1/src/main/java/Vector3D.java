import java.util.Objects;

public class Vector3D {
    private Point3D p; // Поле, хранящее координаты вектора
    //Task16 in Vector3DTest
    // Конструкторы
    public Vector3D() { // Конструктор без параметров, создает нулевой вектор
        p = new Point3D();
    }

    public Vector3D(double x, double y, double z) { // Конструктор с координатами вектора
        p = new Point3D();
        p.setX(x);
        p.setY(y);
        p.setZ(z);
    }

    public Vector3D(Point3D p1, Point3D p2) { // Конструктор, создающий вектор по двум точкам
        p = new Point3D();
        p.setX(p2.getX() - p1.getX());
        p.setY(p2.getY() - p1.getY());
        p.setZ(p2.getZ() - p1.getZ());
    }

    public Point3D getP() { // Геттер для поля p
        return p;
    }

    public double vectorLength() { // Вычисляет длину вектора
        return Math.sqrt(Math.pow(p.getX(), 2) +
                Math.pow(p.getY(), 2) +
                Math.pow(p.getZ(), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Double.compare(vector3D.p.getX(), p.getX()) == 0
                && Double.compare(vector3D.p.getY(), p.getY()) == 0
                && Double.compare(vector3D.p.getZ(), p.getZ()) == 0;
    }

    @Override
    public int hashCode() { // Переопределение метода hashCode
        return Objects.hash(p);
    }
}