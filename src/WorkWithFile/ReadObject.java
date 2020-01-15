package WorkWithFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        //такой синтаксис метода try дает гарнтированность закрытия потока, так используется  tryWithResurses
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
            //FileInputStream fis = new FileInputStream("people.bin"); //когда мы создали объекты до тела метода теперь можно не
            //ObjectInputStream ois = new ObjectInputStream(fis); //использовать метод .close так как java сама это сделает
            Person[] people = (Person[])ois.readObject();
            System.out.println(Arrays.toString(people));
            //ois.close();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
