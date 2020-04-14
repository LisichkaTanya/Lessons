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
        myArrayList.sort();
        System.out.println(myArrayList);
    }
}
