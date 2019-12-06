public class Konstruktor {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        h1.print();
        h1.printNumberOfPeople();
        Human h2 = new Human("Tom", 30);
        h1.setName("Петя");  // Поменяли имя с Вов на Петя
        h1.print();
        h1.printNumberOfPeople();
    }
}
class Human {
    private String name;
    private int age;
    private static int countPeople;
    public Human (String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }
    public void setName(String name) {  //Этим сеттором мы даем возможность в дальнейшем изменить поле имя
        this.name = name;
    }
    public void print(){
        System.out.println("Меня зовут "+name);
    }
}