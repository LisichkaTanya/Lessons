package Tasks.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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

        int[] medium = {a,b,c} ;
        Arrays.sort(medium);
        System.out.println(medium[1]);
    }

//    public static void findMedium(int a, int b, int c) {
//        if ((a==b) && (b==c)) System.out.println(b);
//        int max = Math.max(a, b);
//        if (max < c) max = c;
//
//        int min = Math.min(a, b);
//        if (min > c) min = c;
//
//        if ((a > min) && (a < max)) System.out.println(a);
//        if ((b > min) && (b < max)) System.out.println(b);
//        if ((c > min) && (c < max)) System.out.println(c);
//    }
}
