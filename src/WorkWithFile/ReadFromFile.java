package WorkWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
//возьмем файл который содержит строку "1 2 3"
public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:"+separator+"Users"+separator+"Лисичка"+separator+"Desktop"+separator+"test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine(); //читаем нашу строку, теперь надо каждое число отдельно
        String[] numbersString = line.split(" "); //вставили пробел как индикатор разделителя между цифрами
        System.out.println(Arrays.toString (numbersString));
        int[] numbersInt= new int[3];
        int counter = 0;
        for (String num:numbersString){
            numbersInt[counter++] = Integer.parseInt(num);
        }
        System.out.println(Arrays.toString(numbersInt));
        scanner.close(); //метод закрывает все файлы, чтобы не тратить память компьютера
    }
}
