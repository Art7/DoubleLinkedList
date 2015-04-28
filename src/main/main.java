package main;

/**
 * Created by Artur on 24.04.2015.
 */
public class main {
    public static void main(String[] args) {
        DoubleLinkedCl<String> doubleList = new DoubleLinkedCl<String>();
        doubleList.delByData("33");
        doubleList.insertFirst("10");
        doubleList.display();
        doubleList.insertFirst("20");
        doubleList.display();
        doubleList.insertLast("44");
        doubleList.display();
        doubleList.insertLast("33");
        doubleList.display();
        doubleList.insertFirst("5");
        doubleList.display();
        doubleList.insertOnPosition(3,"66");
        doubleList.insertOnPosition(0,"00");
        doubleList.delByData("25");
        doubleList.display();
        doubleList.delByData("33");
        doubleList.display();
        doubleList.delByData("10");
        doubleList.display();
        doubleList.displayByIndex(3);
        System.out.println();
        doubleList.delByIndex(3);
        doubleList.display();
    }
}
