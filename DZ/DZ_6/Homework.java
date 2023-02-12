package DZ.DZ_6;

import java.util.*;

import javax.management.modelmbean.ModelMBean;
    /**
    1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    2) Создать коллекцию ноутбуков.
    3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
        ноутбуки, отвечающие фильтру.
        Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     */

public class Homework {

    public static void main(String[] args) {
        ArrayList<Laptop> lp = new ArrayList<>();
        Laptop l1 = new Laptop(001, "Asus", "Intel", 32, 1024, "Windows", "Black");
        Laptop l2 = new Laptop(002, "Lenovo", "AMD", 4, 128, "Windows", "White");
        Laptop l3 = new Laptop(003, "Apple", "M1", 8, 256, "macOs", "Golden");
        Laptop l4 = new Laptop(004, "Apple", "M1", 16, 512, "macOS", "Blue");
        Laptop l5 = new Laptop(005, "DEXP", "Intel", 4, 128, "Windows", "Black");
        Laptop l6 = new Laptop(006, "Acer", "Intel", 4, 128, "Windows", "Grey");
        Laptop l7 = new Laptop(007, "GIGABYTE", "AMD", 16, 512, "Windows", "White");
        lp.add(l1);
        lp.add(l2);
        lp.add(l3);
        lp.add(l4);
        lp.add(l5);
        lp.add(l6);
        lp.add(l7);
        
        Map<Integer, String> selectModel = new HashMap<>();
        selectModel.putIfAbsent(1, "Asus");
        selectModel.putIfAbsent(2, "Lenovo");
        selectModel.putIfAbsent(3, "Apple");
        selectModel.putIfAbsent(4, "DEXP");
        selectModel.putIfAbsent(5, "Acer");
        selectModel.putIfAbsent(6, "GIGABYTE");
        

        Map<Integer, String> selectCPU = new HashMap<>();
        selectCPU.putIfAbsent(1, "Intel");
        selectCPU.putIfAbsent(2, "AMD");
        selectCPU.putIfAbsent(3, "M1");

        System.out.println("Определите критерий для поиска ноутбука\n1 - Марка\n2 - CPU");
        String serch = new Scanner(System.in).nextLine();
        switch (serch) {
            case "1" -> printSelectModel(selectModel, lp);
            case "2" -> printSelectCPU(selectCPU, lp);
            default -> System.out.println("Неверно выбран критерий поиска");
        }

        

    }

    private static void printSelectModel(Map<Integer, String> selectModel, ArrayList<Laptop> lp) {
        System.out.println("Выберете модель ноутбука\n1 - Asus\n2 - Lenovo\n3 - Apple\n4 - DEXP\n5 - Acer\n6 - GIGABYTE");
        String model = new Scanner(System.in).nextLine();
        System.out.println("Поиск по модели " + selectModel.get(Integer.parseInt(model)));
        for (int index = 0; index < lp.size(); index++) {
            String sb = lp.get(index).toString();
            if (sb.contains(selectModel.get(Integer.parseInt(model)))){
                System.out.println(lp.get(index));
            }
        }
    }

    private static void printSelectCPU(Map<Integer, String> selectCPU, ArrayList<Laptop> lp) {
        System.out.println("Выберете CPU  ноутбука\n1 - Intel\n2 - AMD\n3 - M1");
        String cpu = new Scanner(System.in).nextLine();
        System.out.println("Поиск по CPU " + selectCPU.get(Integer.parseInt(cpu)));
        for (int index = 0; index < lp.size(); index++) {
            String sb = lp.get(index).toString();
            if (sb.contains(selectCPU.get(Integer.parseInt(cpu)))){
                System.out.println(lp.get(index));
            }
        }
    }

}
