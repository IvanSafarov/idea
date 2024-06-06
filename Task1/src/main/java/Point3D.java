public class Point3D {
//Task15 in Point3DTest
    private double x, y, z;// Декартовы координаты точки

    //Конструктор, создающий точку с заданными координатами.
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Конструктор, создающий точку в начале координат (0, 0, 0).
    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    //Возвращает значение координаты x точки.
    public double getX() {
        return x;
    }

    //Возвращает значение координаты y точки.
    public double getY() {
        return y;
    }

    //Возвращает значение координаты z точки.
    public double getZ() {
        return z;
    }

    //Устанавливает значение координаты x точки.
    public void setX(double x) {
        this.x = x;
    }

    //Устанавливает значение координаты y точки.
    public void setY(double y) {
        this.y = y;
    }

    //Устанавливает значение координаты z точки.
    public void setZ(double z) {
        this.z = z;
    }

    //Выводит информацию о точке на консоль.
    public void printPoint3D() {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }
}
