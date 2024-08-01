//1.Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
//  countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
//2.Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
//3.Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr0 = {7,2,3,4,0,0,2,6};
        int[] arr1 = {7,2,3,4,2,0,5,6};
        System.out.println(countEvens(arr0));
        System.out.println(countEvens(arr1));
        System.out.println(deltaMaxMin(arr0));
        System.out.println(deltaMaxMin(arr1));
        System.out.println(zeroZero(arr0));
        System.out.println(zeroZero(arr1));
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
     * @return разница между самым большим и самым маленьким
     * элементами переданного не пустого массива.
     */
    public static int deltaMaxMin(int[] arr){
        int max,min;
        max = arr[0];
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        return max-min;
    }

    /**
     * 3.Написать функцию, возвращающую истину, если в переданном
     * массиве есть два соседних элемента, с нулевым значением.
     * @param arr Массив целых чисел.
     * @return Булево значение
     */
    public static boolean zeroZero(int[] arr){
        boolean flag = false;
        for (int i = 0; i < (arr.length-1); i++) {
            if ((arr[i] == 0) && (arr[i + 1] == 0)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}