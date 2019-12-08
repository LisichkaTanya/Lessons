package Interfaces;

public class Test {
    public static void main(String[] args) {
        Interface in1 = new Animal(1);
        Interface in2 = new Person("Bob");
        in1.showInfo();
        in2.showInfo();
        outputInfo(in1);
        outputInfo(in2);

    }
    /*Создадим метод, который будет принимать нечто, что реализует (имплементирует) наш интерфейс Interface
    Теперь этот метод (outputInfo) может действовать на любом из объектов, класс которого реализует интерфейс Interface.
    То есть в этот метод мы можем подавать в качестве аргументов либо Animal, либо Person.*/
    public static void outputInfo (Interface info){
        info.showInfo();
    }
}
