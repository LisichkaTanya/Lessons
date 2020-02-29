import java.util.Arrays;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter the values to calculate. For example: \"2+2\"");
            String string = scanner.nextLine();
            calculate(string);
            System.out.println("Do you want to exit calculator? Write: y/n");
        String exit = scanner.nextLine();
        if (exit.equals("y")) break;
        else continue;
        }
    }
    public static void calculate (String s)  {
        String actionSign = " ";
        if (s.matches(".+\\+.+")) actionSign = "+";
        if (s.matches(".+-.+")) actionSign = "-";
        if (s.matches(".+\\*.+")) actionSign = "*";
        if (s.matches(".+\\/.+")) actionSign = "/";
        if (s.matches(".+\\^.+")) actionSign = "^";

        double result = 0;
        String[] a = s.split("(\\+|-|\\*|\\/|\\^)");
        System.out.println(Arrays.toString(a));
        double first = Double.parseDouble(a[0]);
        double second = Double.parseDouble(a[1]);
        if (actionSign.equals("+")) result = first + second;
        if (actionSign.equals("-")) result = first - second;
        if (actionSign.equals("*")) result = first * second;
        if (actionSign.equals("/")) result = first / second;
        if (actionSign.equals("^")) result = Math.pow(first, second);
        System.out.println(" = " + result);
    }
}
