package Tasks.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Как захватить мирВвести с клавиатуры число и имя, вывести на экран строку:«имя» захватит мир
через «число» лет. Му-ха-ха!Пример: Вася захватит мир через 8 лет. Му-ха-ха!
Последовательность вводимых данных имеет большое значение.*/
public class Lesson08Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше имя.");
        String a = reader.readLine();
        System.out.println("Введите через сколько лет вы захватите мир.");
        int x = Integer.parseInt(reader.readLine());
        if (x==1) System.out.println(a+" захватит мир через "+x+" год. Бу-га-га!");
        else if ((x>1)&(x<5)) System.out.println(a+" захватит мир через "+x+" года. Бу-га-га!");
        else System.out.println(a+" захватит мир через "+x+" лет. Бу-га-га!");
    }
}
