public class Fac {
    public static void main(String[] args) {
        System.out.println(fac(15));
    }
    //fac(4) == 24
    //4 * fac(3) == 4*6=24
    //3 * fac(2) == 3*2=6
    //2 * fac(1) == 2*1
    //1 = return 1
    private static int fac(int n){
        if(n == 1)
            return 1;
        System.out.println(n);
        return n * fac(n - 1);
    }
}
