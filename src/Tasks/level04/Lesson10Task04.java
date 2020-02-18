package Tasks.level04;
/* 18.02.2020
 S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/
public class Lesson10Task04 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while(a<10){
            while (b<10){
                System.out.print("$");
                b++;
            }
            System.out.println();
            a++;
            b = 0;
        }
    }
}
