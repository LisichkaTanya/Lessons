package Tasks;
/*
Реализуем метод, который посчитает нам длину окружности. Для этого в методе нужно прописать формулу,
 по которой он это должен делать, и задать параметры. Упростим: пускай Пи = 3.14.
 */
public class Circumference {
    public static void main(String[] args) {
        P(11);
        P(2);
        P(9);
    }
    public static void P (int r){
        double P = 2*3.14*r;
         System.out.println("Вы задали радиус "+r+", значит длина вашей окржности = "+P);
    }
}
