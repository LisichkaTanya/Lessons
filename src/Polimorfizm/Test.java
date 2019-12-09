package Polimorfizm;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Cat cat = new Cat();
        eatAll(animal);
        eatAll(dog);
        eatAll(cat);

    }
    public static void eatAll (Animal animal){
        animal.eat();
    }
}
