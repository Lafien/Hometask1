package nefedov.mycollection;

import java.util.LinkedList;

public class TestSpeed {
    public static void main(String[] args) {
        testMyLinkedList();
        testLinkedList();

    }

    public static void testMyLinkedList(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        long startTime = System.nanoTime();
        for(int i =0; i < 400000; i++){
            myLinkedList.add("Hello");
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for (int i =myLinkedList.size()/2; i > 0; i--){
            myLinkedList.remove(i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        long startTime2 = System.nanoTime();
        for (int i =myLinkedList.size()/5; i < myLinkedList.size()/2; i++){
            myLinkedList.add(i, "NewHello");
        }
        long estimatedTime2 = System.nanoTime() - startTime2;

        System.out.println("Add to MyLinkedList:" + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from MyLinkedList: " + estimatedTime1 / 1000000000.0 + " sec, "+
                "Add to body MyLinkedList: " + estimatedTime2 / 1000000000.0 + " sec,");
    }

    public static void testLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i =0; i < 400000; i++){
            linkedList.add("Hello");
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for (int i =linkedList.size()/2; i > 0; i--){
            linkedList.remove(i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        long startTime2 = System.nanoTime();
        for (int i =linkedList.size()/5; i < linkedList.size()/2; i++){
            linkedList.add(i, "NewHello");
        }
        long estimatedTime2 = System.nanoTime() - startTime2;

        System.out.println("Add to LinkedList:" + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from LinkedList: " + estimatedTime1 / 1000000000.0 + " sec, "+
                "Add to body LinkedList: " + estimatedTime2 / 1000000000.0 + " sec,");
    }
}
