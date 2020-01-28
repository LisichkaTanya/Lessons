package Tasks.level04;
/* 27.01.2020
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
 */

public class Lesson04Task02 {
    public static void main(String[] args) {
        closeToTen(11, 4);
        closeToTen(12, 8);
        closeToTen(13,14);
    }
    public static void closeToTen(int a, int b){
        int n = 10;
        if (abs(n-a) > abs(n-b)){
            System.out.println(b+" ближе к 10");
        } else if (abs(n-a) == abs(n-b)) System.out.println("Любое из них");
        else System.out.println(a+" ближе к 10");
    }
    public static int abs(int a){
        if (a<0) return -a;
        else return a;
    }
}

