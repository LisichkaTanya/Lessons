package Tasks.level02;
/* 15.12.2019
Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
 */
public class Lesson08Task04 {
    public static int min (int a, int b)
    {
        if (a<b) return a;
        else return b;
    }
    public static int min (int a, int b, int c, int d)
    {
        if (min(a,b)<min(c,d)) return min(a,b);
        else return min(c,d);
    }

    public static void main(String[] args) {
        System.out.println(min(-14,5,8,-111));
    }
}
