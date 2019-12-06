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
        //System.out.println("Введите четвертое слагаемое");
        //int four = a.nextInt();
        int[][] summa = {{one,two},{three}};
        //System.out.println(summa[0][0]);
        System.out.println("Вы ввели: ");
        for (int i=0; i<summa.length; i++){        //length узнает количество строк в массиве summa
            for (int j=0; j<summa[i].length; j++){  //length узнает количество столбцов в i-той строке
                System.out.print(summa[i][j] + " ");
            }
            System.out.println();
        }
        int ss = summa[0][0]+summa[0][1]+summa[1][0];
        System.out.println("Ваша сумма = " + ss);
    }
}

