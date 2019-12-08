package Interfaces;

public class Test1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(2);
        Person person1 = new Person("Tom");
        outputInfo(animal1);
        outputInfo(person1);
    }
    /*Создадим метод, который будет принимать нечто, что реализует (имплементирует) наш интерфейс Interface
    Теперь этот метод (outputInfo) может действовать на любом из объектов, класс которого реализует интерфейс Interface.
    То есть в этот метод мы можем подавать в качестве аргументов либо объекты класса Animal, либо Person.
     */
    public static void outputInfo (Interface info){
        info.showInfo();
    }
}
