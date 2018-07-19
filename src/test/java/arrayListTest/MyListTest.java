package arrayListTest;

import arrayList.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        //thêm phần tử vào mảng
        myList.add(0, 12);
        myList.printValue(0);
        myList.add(1, 25);
        myList.printValue(1);

        //in mảng đã thêm phần tử vào
        System.out.println("---------");
        for (int i = 0; i < myList.size(); i++) {
            myList.printValue(i);
        }
        System.out.println();

        //Xóa 1 phần tử trong mảng
        System.out.println("---------");
        myList.remove(1);
        for (int i = 0; i < myList.size(); i++) {
            myList.printValue(i);
        }
        //in ra độ dài của mảng

        System.out.println("***********");
        System.out.println(myList.size());
        //kiểm tra phần tử có ở trong arayList

        System.out.println("============");
        for (int i = 0; i < myList.size(); i++) {
            myList.printValue(i);
        }
        System.out.println(myList.contains(124));
    }
}
