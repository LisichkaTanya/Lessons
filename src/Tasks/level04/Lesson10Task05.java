package Tasks.level04;
/* 18.02.2020
Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/
public class Lesson10Task05 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int r;
        while (i < 11) {
            while (j < 11){
                r = i * j;
                System.out.print(r + " ");
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }
    }
}
