package arrayList;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
//        elements = new Object[capacity];
    }


    public void add(int index, E element) {
        elements[index] = element;
        size++;
        System.out.println(size);
    }

    public void printValue(int index) {
        int count = 1;
        for (int i = 0; i < size; i++) {
            if (index == i) {
                System.out.print("value: " + elements[index] + " index: " + (i + 1));
                System.out.println();
                count++;
            }
        }
        if (count == 1) {
            System.out.println("enter the wrong position!!");
        }
    }

    public E remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

//    public E clone() {
//    }


    public boolean contains(E o) {
        boolean isFound = false;
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(o)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
