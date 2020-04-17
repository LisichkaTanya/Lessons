package BubbleSort;

import java.util.Arrays;

public class BubbleArray {
    private long[] array;
    private static final int MIN_CAPACITY = 3;
    private static final long[] ELEMENT_DATA = new long[MIN_CAPACITY];
    private int size;

    public BubbleArray(){
        this.array = ELEMENT_DATA;
    }

    public void addValue (long value){
        array[size] = value;
        size++;
        if (size >= MIN_CAPACITY){
            array = Arrays.copyOf(array, size+1);
        }
    }

    public void sort (){
        for (int out = size-1; out >=1; out--){
            for (int in = 0; in < out; in++){
                if (array[in] > array[in+1]){
                    long variable = array[in];
                    array[in] = array[in+1];
                    array[in+1] = variable;
                }
            }
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < size ; i++) {
            System.out.print(array[i] + " ");
        }
        return "";
    }
}
