//1.Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
//  countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
//2.Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
//3.Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    /**
     * 1.Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     * @param arr Массив целых чисел
     * @return Количество четных чисел в массиве
     */
    public static int countEvens(int[] arr){
        int count = 0;
        for (int j : arr) {
            if ((j % 2) == 0) count++;
        }
        return count;
    }

    /**
     * 2.Написать функцию, возвращающую разницу между самым
     * большим и самым маленьким элементами переданного
     * не пустого массива.
     * @param arr Массив целых чисел
     * @return Количество четных чисел в массиве
     */
    public static int deltaMaxMin(int[] arr){
        int max,min;
        max = arr[0];
        for (int i = 1; i < ; i++) {

        }
        return;
    }
}