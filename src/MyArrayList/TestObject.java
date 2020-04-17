package MyArrayList;

public class TestObject {
    String name;
    int number;

    public TestObject(String name, int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "name= '" + name + '\'' +
                ", number= " + number + ";";
    }
}
