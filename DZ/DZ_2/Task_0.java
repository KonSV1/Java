// Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
// Требуется перехватить все возможные ошибки и вывести их в логгер.
//
// После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

package DZ.DZ_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;

public class Task_0 {
    public static void logging(String text)throws IOException{
        Logger logger = Logger.getLogger(Task_0.class.getName());
        FileHandler fh = new FileHandler("DZ/DZ_2/log_task_0.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.INFO, text);
        fh.close();
    }
    public static void recFile(String num)throws IOException {
        try (FileWriter fw = new FileWriter("DZ/DZ_2/file.txt", false)){
            fw.write(num);
            fw.flush();
            fw.close();
            }
        catch (IOException e1) {
            logging(e1.getMessage());
        }
    }
    
    public static void main(String[] args) throws IOException {
        byte num;
        System.out.println("Введите целое, число от -128 до 127: ");
        try {
            Scanner scanNum = new Scanner(System.in);
            num = scanNum.nextByte();
            scanNum.close();
            String numStr = Byte.toString(num);
            recFile(numStr);
        }
        catch (Exception e1) {
            logging(e1.getMessage());
        }  
    }
}