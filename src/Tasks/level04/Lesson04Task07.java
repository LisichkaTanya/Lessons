package Tasks.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 27.01.2020
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/
public class Lesson04Task07 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if ((i < 400) && (i % 4 == 0)) System.out.println("Количество дней в году: 366");
        else if (i % 400 == 0) System.out.println("Количество дней в году: 366");
        else System.out.println("Количество дней в году: 365");
        }
    }
