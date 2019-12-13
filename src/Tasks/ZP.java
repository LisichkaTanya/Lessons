package Tasks;
/*
Представьте, что вы получили доступ к автоматизированной системе выплаты зарплаты. Вам нужно написать метод-перехватчик,
который каждый раз будет прибавлять к зарплате 100 долларов.
 */
public class ZP {
    public static void main(String[] args) {
        int zp = 100;
        String s = "Ваша зарплата - ";
        String s1 = "$";
        do {
            System.out.println(s+zp+s1);
            zp = zp+100;
        }
        while (zp<=1000);
    }
}
