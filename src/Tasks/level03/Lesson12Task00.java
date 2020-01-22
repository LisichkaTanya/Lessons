package Tasks.level03;
/*
Реализовать метод, который принимает на вход трехзначное число, а выдает на выходе — сумму его цифр.
 */
public class Lesson12Task00 {
    public static void main(String[] args) {
        System.out.println(method(11111));
    }

    private static int method(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}

    /* 21.01.2020 написала сама
    private static void solution(int digit){
        int sto = digit/100;
        System.out.println(sto);
        int des = (digit-sto*100)/10;
        System.out.println(des);
        int ed = digit - sto*100 - des*10;
        System.out.println(ed);
        int result = sto+des+ed;
        System.out.println(result);
    }*/

