package myListTest;

import myList.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(23);
        listInteger.add(56);
        listInteger.add(12);
        listInteger.add(1);
        listInteger.add(10);
        listInteger.add(153);

        System.out.println("element 3: "+listInteger.get(3));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 4: "+listInteger.get(4));
        //error
        System.out.println("element 3: "+listInteger.get(6));

        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
