package Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        listOfAnimal.add(new Dog());
        test(listOfAnimal);
    }
    public static void test (List<? extends Animal>list){ //мы поставили <?extends Animal> так как полиморфизм здесь не работает
                                               //значит в этом List будут Animal и все его потомки (т.е. те кто ниже)
        for (Animal animal: list){
            System.out.println(animal);
        }
    }
}
