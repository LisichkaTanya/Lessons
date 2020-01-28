package Tasks.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 27/01/2020
Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/
public class Lesson04Task09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество минут");
        double t = Double.parseDouble(reader.readLine());
        if (t>60) t=t/60;
        if (t%5<3) System.out.println("Зеленый");
        else if (t%5<4) System.out.println("Желтый");
        else System.out.println("Красный");
    }
}
