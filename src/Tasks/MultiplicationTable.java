package Tasks;
/* 15.12.2019
Создать таблицу умножения размером 10*10 и вывести на экран
 */
public class MultiplicationTable {
    public static void main(String[] args) {
       /* for (int i=1; i<10; i++){
            for (int j = 1; j<10; j++){
                int r = i*j;
                System.out.print(r+" ");
            }
            System.out.println();
        }*/
       int i = 1;
       while (i<10){
           for (int j = 1; j<10; j++){
               int r = i*j;
               System.out.print(r+" ");
           }
           i++;
           System.out.println();
       }
    }
}
