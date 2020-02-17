package Tasks.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 17.02.2020
 Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/
public class Lesson07Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());
        if (a==0) System.out.println("Число "+a+" нулевое");
        else {
            if (a > 0) {
                if (a%2==0)System.out.println("Число "+a+" положительное четное");
                else System.out.println("Число "+a+ " положительное нечентное");
            }
            else {
                if (a%2==0) System.out.println("Число "+a+" отрицательное четное");
                else System.out.println("Число "+a+" отрицательное нечетное");
            }

        }
    }
}
