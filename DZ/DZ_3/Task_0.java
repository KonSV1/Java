package DZ.DZ_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Task_0
 */
public class Task_0 {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> int_list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(removeEvenValue(int_list));
        System.out.println(getMin(int_list));
        System.out.println(getMax(int_list));
        System.out.println(getAverage(int_list));

    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list) {
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            if (col.next() % 2 == 0) {
                col.remove();
            }
        }
        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list) {
        int min = Collections.min(list);
        return min;
}

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list) {
        int max = Collections.max(list);
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        int ave = sum/list.size();
        return ave;
    }
}
