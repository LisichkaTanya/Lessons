public class Metodi {
    public static void main(String[] args) {
        Person person1 = new Person(); //создали новый объект класса Person
        Person person2 = new Person();
        person1.name = "Вова"; //Вызвали параметр name из класса и задали значение
        person1.age = 45;
        person1.speak(); //Вызвали метод из класса

        person2.setName("Петя"); //Вызвали метод с параметрами и задали определенный параметр
        person2.age = 20;
        person2.speak();
        System.out.println("Мне до пенсии "+person1.calculateYears()+" лет.");
        System.out.println("Мне до пенсии "+person2.calculateYears()+" лет.");

        Person person3 = new Person();
        String s1 = "Коля"; //мы можем заранее задать строку с именем и подставлять ее в параметры метода
        person3.setName(s1);
        person3.speak();
    }
}
class Person{
    // поля
    String name;
    int age;

    //методы
    void speak(){  //метод с пустыми параметрами, то есть в скобках () ничего нет
        System.out.println("Меня зовут "+name+" и мне "+age+" лет.");
    }
    int calculateYears (){
        int years = 65-age;
        return years; //вернет целое значение в то место, где мы вызовем этот метод
    }
    void setName (String username){
        name = username; //теперь у каждого объекта, в котором вызван этот метод, поле name станет присваиваться значение заданное username
    }
}