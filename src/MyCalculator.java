import java.util.Arrays;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите значения для вычисления. Пример: \"2 + 2\"");
            String string = scanner.nextLine();
            calculate(string);
            System.out.println("Do you want exit calculator? Write: yes/no");
        String exit = scanner.nextLine();
        if (exit.equals("yes")) break;
        else continue;
        }
    }
    public static void calculate (String s){
        double result = 0;
        String[] a = s.split(" ");
        double first = Double.parseDouble(a[0]);
        double second = Double.parseDouble(a[2]);
        if (a[1].equals("+")) result = first + second;
        if (a[1].equals("-")) result = first - second;
        if (a[1].equals("*")) result = first * second;
        if (a[1].equals("/")) result = first / second;
        if (a[1].equals("^")) result = Math.pow(first, second);
        //s.matches("\\d+ (\\+|-|\\*|/|^) \\d+");
        //System.out.println(Arrays.toString(a));
        System.out.println(" = " + result);
    }
}
