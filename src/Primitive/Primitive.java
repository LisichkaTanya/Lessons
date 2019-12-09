package Primitive;

public class Primitive {
    public static void main(String[] args) {
        int i = 1234567890;  // целочисленные (32 бит или 4 байт) //ПО УМОЛЧАНИЮ
        long l = 1234567890123456789L;  // целочисленные (64 бит)
        short sh = 123;  // целочисленные, но короткое (16 бит)
        byte b = 1;  // от -128 до 127 (8 бит), если задать 129, то покажет -127 (т.е. будет крутить по кругу)

        double d = 11.52;  // вещественное (64 бит) //ПО УМОЛЧАНИЮ
        float f = 123.6F;  // вещественное (32 бит)

        char c = 'a'; // один символ (в одинарных ковычках)
        boolean bo = true; // может быть true или false

        int x = (int)l;
        System.out.println(x);
        int x1 = (int)f;
        System.out.println(x1);
        long l1 = Math.round(d);
        System.out.println(l1);
    }
}
