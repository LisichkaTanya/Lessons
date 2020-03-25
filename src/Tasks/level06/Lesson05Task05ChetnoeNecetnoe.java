package Tasks.level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Давайте определим, сколько четных цифр, а сколько нечетных в числе, введенном с клавиатуры.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное. Увеличиваем на 1 счетчик четных цифр
(статическая переменная even). Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
 */
public class Lesson05Task05ChetnoeNecetnoe {
    static int even, odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String exit = "start";
        while (true) {
            System.out.println("Enter new number. For exit enter: 'end'.");
            exit = bufferedReader.readLine();
            if (exit.equals("end")){
                System.out.println("even = " + even + "\n" +
                        "odd = " + odd);
                break;
            }
            int number = Integer.parseInt(exit);
            if (number % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
    }
}
