package Tasks.level03;
/* 16.12.2019
Реализация метода. Реализуйте метод public static void div(int a, int b).
Метод должен делить первое число на второе,
и выводить на экран результат деления а / b.
*/
public class Lesson01Task01 {
    public static void main(String[] args) {
        div(5,2);
        div(10, 6);
        div(2,4);
    }
    public static void div (double a, double b){
        System.out.println(a/b);
    }
}
