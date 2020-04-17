package BubbleSort;

public class TestBubbleArray {
    public static void main(String[] args) {
        BubbleArray bubbleArray = new BubbleArray();
        bubbleArray.addValue(834);
        bubbleArray.addValue(12);
        bubbleArray.addValue(89);
        bubbleArray.addValue(987);
        System.out.println(bubbleArray);
        bubbleArray.sort();
        System.out.println(bubbleArray);
    }
}
