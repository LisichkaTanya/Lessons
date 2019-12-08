package Interfaces;

public class Person implements Interface {
    String name;

    public Person (String name){
        this.name = name;
    }
    public void showInfo() {
        System.out.println ("My name is "+name);
    }
}
