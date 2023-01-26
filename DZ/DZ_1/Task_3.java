package DZ.DZ_1;

/* Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */

public class Task_3 {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            switch (i) {
                case 2:
                case 3:
                case 5:
                case 7:
                    System.out.print(" " + i);
                    break;
                default:
                    if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                        System.out.print(" " + i);
                    }
                    break;
            }
        }
    }
}