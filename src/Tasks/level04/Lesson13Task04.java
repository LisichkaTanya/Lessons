package Tasks.level04;
/* 26.02.2020
 Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/
public class Lesson13Task04 {
    public static void main(String[] args) {
        int a = 8;
        for (int x = 1; x < 10; x++){
            System.out.print(a+" ");
        }
        for (int x = 0; x < 10; x++){
            System.out.println(a);
        }
    }
}
