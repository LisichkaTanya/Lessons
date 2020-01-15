package Tasks.level04;

import java.util.Scanner;

/** 06.01.2020
 *  День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
**/
public class Lesson04Task06 {
    public static void main(String[] args) {
        while (true){
            System.out.println("Введите номер дня недели.");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n){
                case 1: System.out.println("понедельник");
                    break;
                case 2: System.out.println("вторник");
                    break;
                case 3: System.out.println("среда");
                    break;
                case 4: System.out.println("четверг");
                    break;
                case 5: System.out.println("пятница");
                    break;
                case 6: System.out.println("среда");
                    break;
                case 7: System.out.println("среда");
                    break;
                default: System.out.println("Такого дня недели не существет");
            }
        }
    }
}
