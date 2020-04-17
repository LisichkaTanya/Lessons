package MyArrayList;

import java.util.Arrays;

public class MyArrayList<E>  {
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

    public Object getValue(int index){
        return elementData[index];
    }

//    public void sort (){
//        for (int out = size-1; out >=1; out--){
//            for (int in = 0; in < out; in++){
//                if (getValue(in) > getValue(in+1)){
//                    Object variable = elementData[in];
//                    elementData[in] = elementData[in+1];
//                    elementData[in+1] = variable;
//                }
//            }
//        }
//    }

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
