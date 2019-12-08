package Interfaces;

public class Animal implements Interface {
    int id;

    public Animal (int id){
        this.id = id;
    }
    public void showInfo() {
        System.out.println("My id is "+id);
    }
}
