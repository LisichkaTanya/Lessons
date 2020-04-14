package MyArrayList;

import java.util.Arrays;

public class MyArrayList {
    int [] elementData;
    private static final int MIN_CAPACITY = 3;
    private static final int[] ELEMENT_DATA = new int[MIN_CAPACITY];
    private int size;


    public MyArrayList(){
        this.elementData = ELEMENT_DATA;
    }

    public void add (int element){
            elementData[size] = element;
            size++;
        if (size >= MIN_CAPACITY){
            elementData = Arrays.copyOf(elementData, size+1);
        }
    }

    public void sort (){
        for (int out = size-1; out >=1; out--){
            for (int in = 0; in < out; in++){
                if (elementData[in] > elementData[in+1]){
                    int variable = elementData[in];
                    elementData[in] = elementData[in+1];
                    elementData[in+1] = variable;
                }
            }
        }
    }

    public void remove(int index){
        for (int i = 0; i < size; i++){

        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < size; i++){
            System.out.print(elementData[i] + " ");
        }
        return "";
//        return "MyArrayList = " + Arrays.toString(elementData) +
//                "\nSize = " + size;
    }
}
