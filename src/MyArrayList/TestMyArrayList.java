package MyArrayList;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(333);
        myArrayList.add(555);
        myArrayList.add(444);
        myArrayList.add(777);
        myArrayList.add(666);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
//        myArrayList.sort();
//        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(8));
        System.out.println(myArrayList.size());

        MyArrayList<TestObject> array = new MyArrayList<TestObject>();
        array.add(new TestObject("Tatiana", 1));
        array.add(new TestObject("Daria", 2));
        System.out.println(array);
        System.out.println(array.get(1));
        System.out.println(array.size());
        array.remove(0);
        System.out.println(array);
    }
}
