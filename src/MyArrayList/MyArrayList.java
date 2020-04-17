package MyArrayList;

import java.util.*;

public class MyArrayList {
    private Object[] elementData;
    private static final int MIN_CAPACITY = 3;
    private static final Object[] ELEMENT_DATA = new Object[MIN_CAPACITY];
    private int size;


    public MyArrayList(){
        this.elementData = ELEMENT_DATA;
    }

    public void add (Object value){
            elementData[size] = value;
            size++;
        if (size >= MIN_CAPACITY){
            elementData = Arrays.copyOf(elementData, size+1);
        }
    }

    public void remove(int index){
        if (index <= size){
            elementData[index] = null;
            createNewArray(elementData);
        }
        else System.out.println("This index not found");
    }

    private void createNewArray(Object[] elementData) {
        Object[] temp = new Object[size];
        int j = 0;
        for (int i = 0; i < size; i++){
            temp[j] = (elementData[i] != null ? elementData[i] : elementData[++i]);
            j++;
        }
        size--;
        this.elementData = temp;
    }

    public Object get(int index) {
        if (index > size) {
            return "Have no this index";
        }
        return elementData[index];

    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        for (int i = 0; i < size; i++){
            System.out.print(elementData[i] + " ");
        }
        return "";
    }

//    public void sort(Comparator c){
//        Arrays.sort(elementData, 0, size, c);
//    }
}
