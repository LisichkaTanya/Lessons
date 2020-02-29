package Tasks.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Давайте найдем середину, а точнее — среднее число среди троицы целых чисел типа int.
Ну а если станется так, что все три числа будут одинаковые, можем вывести любое из них: всё равно никто не заметит.
 */
public class Lesson16Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers for comparing");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        findMedium(a,b,c);
        /*
        можно сделать через массив и метод .sort()
         */
//        int[] medium = {a,b,c} ;
//        Arrays.sort(medium);
//        System.out.println(medium[1]);
    }

    public static void findMedium(int a, int b, int c) {
        int med;
        if ((a==b) && (b==c)) med = b;
        int max = Math.max(a, b);
        if (max < c) max = c;
        int min = Math.min(a, b);
        if (min > c) min = c;
        med = a + b + c - min - max;
        System.out.println("Medium number is: "+ med);
   }
}
