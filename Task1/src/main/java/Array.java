import java.util.Scanner;

public class Array {
    //Task8-14 in ArrayTest
    private int[] array;

    public Array(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("wrong size");
        }
        array = new int[size];
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void outputArray() { // Вывод массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Считывание чисел с клавиатуры (первое число - кол-во чисел, которое планируется ввести)
    public void inputArray(int[] inputArray) {
        for (int i = 0; i < array.length; i++) {
            array[i] = inputArray[i];
        }
    }


    // Сумма чисел массива
    public long sumArray() {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Сколько чётных чисел
    public int evenNumbers() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Числа принадлежащие отрезку
    public int segment(int a, int b) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                count++;
            }
        }
        return count;
    }

    // Все ли числа положительные
    public boolean allPositive() {
        if (array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    // Реверс массива
    public void reverse() {
        int d;
        for (int i = 0; i < array.length / 2; i++) {
            d = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = d;
        }
        System.out.println("Reversed");
    }
}
