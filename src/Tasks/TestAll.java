package Tasks;

public class TestAll {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        //anotherMethod();
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = new Exception().getStackTrace();
        if (ste.length < 3) {
            return null;
        } else {
            return ste[2].getClassName() + "#" + ste[2].getMethodName();
        }
    }


}
