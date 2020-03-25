package Tasks.level05;
/*
Представим, что у нас есть свинья-копилка. В неё можно складывать монетки, пока в какой-то момент вы её не разобьете.
Давайте напишем консольный эмулятор такой копилки: будем вводить с клавиатуры числа и складывать их до тех пор,
пока не «разобьем» этот процесс специальным словом «сумма». После этого программа должна вывести нам накопленную сумму.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson12Task05Moneybox {
    public static void main(String[] args) throws IOException {
        int moneybox = 0;
        int sum = 0;
        String string = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("How much do you want to put in moneybox? If you want to get sum, enter word 'sum'.");
            string = reader.readLine();
            if (string.equals("sum")) {
                System.out.println("Sum is " + sum);
                break;
            }
            else {
                moneybox = Integer.parseInt(string);
                sum = sum + moneybox;

            }
        }
    }
}
