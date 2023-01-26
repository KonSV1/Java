package DZ.DZ_1;

import java.util.Arrays;

/* Реализуйте алгоритм сортировки пузырьком для сортировки массива */
public class Task_2 {
    public static void main(String[] args) {
        int l = 5 + (int)(Math.random() *20 +1);
        int[] arr = new int [l];
        for (int i = 0; i < l; i++) {
            arr[i] = (int)(Math.random() *30 +1);
        }
        System.out.println(Arrays.toString(arr) + "\tИсходный массив");
        boolean endSort = false;
        int x;
        while(!endSort) {
            endSort = true;
            for (int i = 0; i < l-1; i++) {
                if(arr[i] > arr[i+1]){
                    endSort = false;
 
                    x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(arr) + "\tОтсортированный массив");
    }
}
