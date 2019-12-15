package Tasks.level02;

public class Lesson06 {
    public static void main(String[] args) {
        Student olga = new Student();
        olga.name = "Olga";
        olga.age = 21;

        Student vera = new Student();
        vera.name = "Veronika";
        vera.age = 15;

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);

        ageSwap(olga, vera);

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);
    }

    private static void ageSwap(Student a, Student b) {
        int c = a.age;
        a.age = b.age;
        b.age = c;
    }

    static class Student {
        String name;
        int age;
    }
}
