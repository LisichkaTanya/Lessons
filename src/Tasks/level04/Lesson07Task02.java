package Tasks.level04;
/* 17.02.2020
 Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson07Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a = Integer.parseInt(reader.readLine());
        if ((a>=1)&&(a<1000)){
            if (a%2==0){
                if (a>=100) System.out.println("четное трехзначное число");
                else if (a<10) System.out.println("четное однозначное число");
                else System.out.println("четное двузначное число");
            }
            else if (a>=100) System.out.println("нечетное трехзначное число");
            else if (a<10) System.out.println("нечетное однозначное число");
            else System.out.println("нечетное двузначное число");
        }
    }
}
