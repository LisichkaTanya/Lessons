package MyLinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

// метод добавления
    public void add (int value){
        if (head == null) this.head = new Node(value);
        else {
           Node temp = head;
           while (temp.getNext() != null){
               temp = temp.getNext();
           }
           temp.setNext(new Node(value));
        }
        size++;
    }

    //Переопределяем метод для вывода на экран
    @Override
    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node temp = head;
        while (temp != null){
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    // Метод Get
    public int get (int index){
        int currentIndex = 0;
        Node temp = head;
        while (temp != null){
            if (currentIndex == index) return temp.getValue();
            temp = temp.getNext();
            currentIndex++;
        }
        throw new IllegalArgumentException();
    }

    //Метод удаления
    public void remove (int index){
        int ind = 0;
        Node temp = head;
        if (index == 0){
            head = head.getNext();
            size--;
            return;
        }
        while (temp != null){
            if (ind == index-1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else {
                temp = temp.getNext();
                ind++;
            }
        }
        throw new IllegalArgumentException();
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
        public Node getNext() {
            return next;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
}

