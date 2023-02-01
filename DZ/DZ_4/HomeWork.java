

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class HomeWork {

    // Даны два Deque представляющие два целых числа. Цифры хранятся в обратном
    // порядке,
    // и каждый из их узлов содержит одну цифру.

    public static void main(String[] args) {
        Deque<Integer> m1 = new ArrayDeque<>(Arrays.asList(5, 2));
        Deque<Integer> m2 = new ArrayDeque<>(Arrays.asList(4));
        // result [0,0,1]
        Deque<Integer> s1 = new ArrayDeque<>(Arrays.asList(5, -2));
        Deque<Integer> s2 = new ArrayDeque<>(Arrays.asList(5));
        // result [0,-2]
        System.out.println(mult(m1, m2));
        System.out.println(sum(s1, s2));
    }

    // Умножьте два числа и верните произведение в виде связанного списка.
    public static Deque<Integer> mult(Deque<Integer> m1, Deque<Integer>m2){
        int r1 = m1.size();
        int r2 = m2.size();
        String x = "";
        String y = "";
        for (int i = 1; i <= r1; i++) {
            x = x + m1.removeLast();
        }
        int x1 = Integer.parseInt(x);
        System.out.println(x1);
        for (int i = 1; i <= r2; i++) {
            y = y + m2.removeLast();
        }
        int y1 = Integer.parseInt(y);
        System.out.println(y1);
        Deque<Integer> mRes =  new ArrayDeque<>();
        int res = x1 * y1;
        System.out.println(res);
        while(res > 0) {
            mRes.addLast(res%10);
            res = res /10;            
        }
        return mRes;
    }


    // Сложите два числа и верните сумму в виде связанного списка. Одно или два
    // числа должны быть отрицательными
    public static Deque<Integer> sum(Deque<Integer> s1, Deque<Integer> s2) {
        Deque<Integer> res = new ArrayDeque<>();
        int summ = 0;
        int tmp = 0;
        int size = s2.size();
        if (s1.getLast() > 0 && s2.getLast() > 0){
            for (int i = 0; i < size; i++) {
                summ = s1.removeFirst() + s2.removeFirst();
                if (summ > 9) {
                    res.addLast(summ % 10 + tmp);
                    tmp = summ / 10;
                } else {
                    res.addLast(summ + tmp);
                    tmp = 0;
                }
            }
            summ = 0 + s1.removeFirst();
            if (summ > 9) {
                res.addLast(summ % 10 + tmp);
                tmp = summ / 10;
            } else {
                res.addLast(summ + tmp);
                tmp = 0;
            }
            if (tmp > 0) {
                res.addLast(tmp);
            }
        }else {
            for (int i = 0; i < size; i++) {               
                summ = s1.removeFirst() - s2.removeFirst();
                if (summ > 9) {
                    res.addLast(summ % 10 - tmp);
                    tmp = summ / 10;
                } else {
                    res.addLast(summ - tmp);
                    tmp = 0;
                }
            }
            summ = 0 + s1.removeFirst();
            if (summ > 9) {
                res.addLast(summ % 10 - tmp);
                tmp = summ / 10;
            } else {
                res.addLast(summ - tmp);
                tmp = 0;
            }
            if (tmp > 0) {
                res.addLast(tmp);
            }
        }
        return res;
        
    }
}