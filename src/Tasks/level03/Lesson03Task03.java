package Tasks.level03;
/* 28.12.2019
10 процентовРеализуйте метод addTenPercent,
который увеличивает переданное целое число на 10%.
Подсказка: подумайте, какие у этого метода входные и выходные данные */

public class Lesson03Task03 {
    public static void main(String[] args) {
        /* addTenPercent(15);
        addTenPercent(144.144);             так сделала я сначала*/
        System.out.println(addTenPercent(15));
        System.out.println(addTenPercent(144.144));
    }
    public static double addTenPercent (double i){
        /* double c = i+i*0.1;
        System.out.println(c);
        return c;                            так сделала я сначала*/
        return i+i*0.1;
    }
}
