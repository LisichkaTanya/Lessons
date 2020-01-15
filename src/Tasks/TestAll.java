package Tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestAll {
    public static void main(String[] args) throws java.io.IOException
    {
        FileInputStream input = new FileInputStream("C:\\Users\\Лисичка\\Documents\\data.jpg");
        FileOutputStream output = new FileOutputStream("C:\\Users\\Лисичка\\Documents\\result.jpg");

        while (input.available() > 0)
        {
            int data = input.read();
            System.out.println(data);
            output.write(data);
        }

        input.close();
        output.close();
    }
}
