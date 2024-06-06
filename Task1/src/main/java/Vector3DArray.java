import java.util.ArrayList;

public class Vector3DArray {
    private Vector3D[] vectors; // Массив трехмерных векторов

    // Конструктор, создает массив из нулевых векторов
    public Vector3DArray(int size){
        vectors = new Vector3D[size];
        for (int i = 0; i < size; i++){
            vectors[i] = new Vector3D();
        }
    }

    // Возвращает длину массива векторов
    public int arrayLen(){
        return vectors.length;
    }

    // Заменяет i-й элемент массива на заданный вектор
    public void setElem(int i, Vector3D elem){
        vectors[i].getP().setX(elem.getP().getX());
        vectors[i].getP().setY(elem.getP().getY());
        vectors[i].getP().setZ(elem.getP().getZ());
    }

    // Возвращает i-й вектор в массиве
    public Vector3D getElem(int i) {
        return vectors[i];
    }

    // Находит наибольшую длину вектора в массиве
    public double maxLen(){
        double max = 0;
        for (Vector3D vector : vectors) {
            if (Double.compare(vector.vectorLength(),max)>0) {
                max = vector.vectorLength();
            }
        }
        return max;
    }

    // Ищет заданный вектор в массиве, возвращает индекс или -1 если не найден
    public int findVector(Vector3D v) {
        int ind = -1;
        Vector3D t;
        for (int i = 0; i < vectors.length; i++){
            t = vectors[i];
            if (t.equals(v)){
                ind = i;
                break;
            }
        }
        return ind;
    }

    // Вычисляет сумму всех векторов в массиве
    public Vector3D vectorsSum(){
        Vector3D v = new Vector3D();
        Vector3D t;
        for (Vector3D vector : vectors) {
            t = vector;
            v.getP().setX(v.getP().getX() + t.getP().getX());
            v.getP().setY(v.getP().getY() + t.getP().getY());
            v.getP().setZ(v.getP().getZ() + t.getP().getZ());
        }
        return v;
    }

    // Вычисляет линейную комбинацию векторов с заданными коэффициентами
    public Vector3D vectorsComb(int[] array){
        Vector3D v = new Vector3D();
        Vector3D t;
        if (array.length != vectors.length)
            return v; // Возвращает нулевой вектор, если длины массивов не совпадают
        for (int i = 0; i < vectors.length; i++){
            t = vectors[i];
            v.getP().setX(v.getP().getX() + array[i] * t.getP().getX());
            v.getP().setY(v.getP().getY() + array[i] * t.getP().getY());
            v.getP().setZ(v.getP().getZ() + array[i] * t.getP().getZ());
        }
        return v;
    }

    // Вычисляет массив точек, сдвинутых по соответствующим векторам
    public ArrayList<Point3D> vectorsPoint(Point3D p){
        ArrayList<Point3D> points = new ArrayList<>();
        Point3D t;

        for (Vector3D vector : vectors) {
            t = vector.getP();
            p.setX(p.getX() + t.getX());
            p.setY(p.getY() + t.getY());
            p.setZ(p.getZ() + t.getZ());
            points.add(t);
        }
        return points;
    }
}