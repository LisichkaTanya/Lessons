package Tasks;


import java.io.File;
import java.io.IOException;

public class TestAll {
    public static void main(String[] args) throws IOException {
        int i = 0;
        while (i < 2) {
            int byteIn = System.in.read();
            System.out.println(byteIn);
            i++;
        }
    }

}
