package WorkWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ReadFile");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){ //этот метод возвращает true, если есть непрочитанные строки, и false, если все прочитаны
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
