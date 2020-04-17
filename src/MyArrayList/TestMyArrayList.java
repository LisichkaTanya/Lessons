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
    }
}
