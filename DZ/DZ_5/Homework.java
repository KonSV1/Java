package DZ.DZ_5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:Иван Иванов (и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

/* 
Иван Иванов 88001122333
Иван Курицин 88001662333
Иван Курицин 88001112333
Иван Незлобин 88001122432
Сергей Потапов 88001112453
Сергей Потапов 8800163214
Сергей Курицин 8800142421
Михаил Незлобин 880012343

OutPut
Иван - 3
Сергей - 2
Потому как если один сотрудник имеет 2 или более номера , его имя считаем 1 раз.
*/




public class Homework {

    public static void main(String[] args) {
        Map<Double, String> pb = new HashMap<Double, String>();
        pb.putIfAbsent(88001122333D, "Иван Иванов");
        pb.putIfAbsent(88001662333D, "Иван Курицин");
        pb.putIfAbsent(88001112333D, "Иван Курицин");
        pb.putIfAbsent(88001122432D, "Иван Незлобин");
        pb.putIfAbsent(88001112453D, "Сергей Потапов");
        pb.putIfAbsent(8800142421D, "Сергей Курицин");
        pb.putIfAbsent(880012343D, "Михаил Незлобин");
        Map<String, Integer> count = new HashMap<String, Integer>();
        count = countName(pb);
        TreeMap<Integer, String> sort = new TreeMap<>(Collections.reverseOrder());
        sort = sort(count);
        for (Entry<Integer, String> item: sort.entrySet()) {
            System.out.printf("%s - %d \n", item.getValue(), item.getKey());
        }
    }

    public static Map<String, Integer> countName(Map<Double, String> pb) {
        String name = "";
        Map<String, Integer> countName = new HashMap<String, Integer>();
        Map<Double, String> deleteCopy = new HashMap<Double, String>();
        for (var item : pb.entrySet()) {
            if(!deleteCopy.containsValue(item.getValue())) {
                deleteCopy.put(item.getKey(), item.getValue());
            }
        }
        for (var item : deleteCopy.entrySet()) {
            name = item.getValue().split(" ")[0];
            if (!countName.containsKey(name)) {
                countName.put(name, 1);
            }
            else {
                countName.put(name, countName.get(name) + 1);
            }
        }
        return countName;
    }

    public static TreeMap<Integer, String> sort(Map<String, Integer> count) {
        TreeMap<Integer, String> sort = new TreeMap<>(Collections.reverseOrder());
        for (var item : count.entrySet()) {
            if (item.getValue() > 1) {
                sort.put(item.getValue(), item.getKey());
            }
        }
        return sort;
    }
}