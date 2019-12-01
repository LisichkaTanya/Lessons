import java.util.Scanner;

public class CalcPlus {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Начинаем суммировать числа");
        System.out.println("Введите первое слагаемое");
        int one = a.nextInt();
        System.out.println("Введите второе слагаемое");
        int two = a.nextInt();
        System.out.println("Введите третье слагаемое");
        int three = a.nextInt();
        System.out.println("Введите четвертое слагаемое");
        int four = a.nextInt();
        int[][] summa = {{one,two},{three,four}};
        //System.out.println(summa[0][0]);
        System.out.println("Вы ввели: ");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print(summa[i][j] + " ");
            }
            System.out.println();
        }
        int ss = summa[0][0]+summa[0][1]+summa[1][0]+summa[1][1];
        System.out.println("Ваша сумма = " + ss);
    }
}

