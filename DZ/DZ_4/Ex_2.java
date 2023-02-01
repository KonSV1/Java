
import java.util.ArrayDeque;
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false
public class Ex_2 {
    public static void main(String[] args) {
        String str = "{[()]}";
        ArrayDeque<Character> deq = new ArrayDeque<>();
        if (checkOn(deq, str)){
            System.out.println(str + " - true");
        }else {
            System.out.println(str + " - false");
        }
    }

    private static boolean checkOn(ArrayDeque<Character> deq, String str) {
        String closeChars = ")}]";
        String openChars = "({[";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                deq.addFirst(str.charAt(i));
            }
            else {
                for (int j = 0; j < 3; j++) {
                    if  (str.charAt(i) == openChars.charAt(j)){
                        deq.addFirst(str.charAt(i));
                    }else{
                        if (str.charAt(i) == closeChars.charAt(j)){
                            if (openChars.charAt(j) == deq.getFirst()){
                                deq.removeFirst();
                            }else{
                                deq.addFirst(openChars.charAt(j));
                            }
                        }
                    }
                }

            }
        }
        if (deq.size() == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
