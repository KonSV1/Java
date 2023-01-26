package DZ.DZ_1;

import java.util.Arrays;

/**
 * Task_1
 * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].
 */
public class Task_1 {

    public static void main(String[] args) {
        int l = (int)(Math.random() *50 +1);
        int[] arr = new int [l];
        for (int i = 0; i < l; i++) {
            arr[i] = (int)(Math.random() *300 +1);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[1]; 
        for (int i = 1; i < l; i++) {
            if (arr[i] > max) max = arr[i];
            }
        System.out.println("Max = "+ max);
    }
}