package Tasks;

import java.util.Scanner;

/*
Конвертер - «переводчик» из градусов Цельсия в градусы Фаренгейта.
 */
public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите гардусы по Цельсию");
        double c = scan.nextDouble();
        converter(c);
    }
    public static void converter (double c) {
        double f = (c*1.8+32);
        System.out.printf("Вы получите в Фаренгейтах %.2f %s",f," градусов");
    }

}
