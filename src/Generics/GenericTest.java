package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List <String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Frog");
        String animal = animals.get(2);
        System.out.println(animal);
    }
}
