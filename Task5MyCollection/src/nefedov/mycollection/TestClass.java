package nefedov.mycollection;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        testAllList();
        System.out.println();
        testAllSet();
        System.out.println();
        testAllMap();

        //testArrayList();
        //testLinkedList();

        //TestHashSet();
        //TestLinkedHashSet();
        //TestTreeSet();

        //TestHashMap();
        //TestLinkedHashMap();
        //TestTreeMap();

    }

    private static void testAllList(){
        testArrayList();
        testLinkedList();
    }

    private static void testAllSet(){
        TestHashSet();
        TestLinkedHashSet();
        TestTreeSet();
    }

    public static void testAllMap(){
        TestHashMap();
        TestLinkedHashMap();
        TestTreeMap();
    }

    //Array vs Linked
    private static void testArrayList(){
        ArrayList<String> arrayList = new ArrayList<String>();

        long startTime = System.nanoTime();
        for (int i =0; i < 400000; i++){
            arrayList.add("Hello");
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for (int i =arrayList.size()/2; i > 0; i--){
            arrayList.remove(i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        long startTime2 = System.nanoTime();
        for (int i =arrayList.size()/5; i < arrayList.size()/2; i++){
            arrayList.add(i, "NewHello");
        }
        long estimatedTime2 = System.nanoTime() - startTime2;

        System.out.println("Add to ArrayList: " + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from ArrayList: " + estimatedTime1 / 1000000000.0 + " sec, " +
                "Add to body ArrayList: " + estimatedTime2 / 1000000000.0 + " sec,");
    }

    private static void testLinkedList(){
        LinkedList<String> linkedList = new LinkedList<String>();

        long startTime = System.nanoTime();
        for (int i =0; i < 400000; i++){
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


    //HashSet, LinkedHashSet, TreeSet

    private static void TestHashSet(){
        HashSet<String> hashSet = new HashSet<String>();

        long startTime = System.nanoTime();
        for(int i =0; i<2500000; i++){
            hashSet.add("Hello"+i);
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for (int i =hashSet.size()/2; i > 0; i--){
            hashSet.remove(i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        System.out.println("Add to HashSet: " + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from HashSet: " + estimatedTime1 / 1000000000.0 + " sec");
    }

    private static void TestLinkedHashSet(){
        LinkedHashSet<String> linkedHashSet =  new LinkedHashSet<String>();

        long startTime = System.nanoTime();
        for(int i =0; i<2500000; i++){
            linkedHashSet.add("Hello"+i);
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for (int i =linkedHashSet.size()/2; i > 0; i--){
            linkedHashSet.remove(i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        System.out.println("Add to LinkedHashSet: " + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from LinkedHashSet: " + estimatedTime1 / 1000000000.0 + " sec");
    }

    private static void TestTreeSet(){
        TreeSet<String> treeSet =  new TreeSet<String>();

        long startTime = System.nanoTime();
        for(int i =0; i<2500000; i++){
            treeSet.add("Hello"+i);
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for (int i =treeSet.size()/2; i > 0; i--){
            //treeSet.remove(i);
            treeSet.remove("Hello"+i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        System.out.println("Add to TreeSet: " + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from TreeSet: " + estimatedTime1 / 1000000000.0 + " sec");
    }


    //HashMap, LinkedHashMap, TreeMap

    private static void TestHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        long startTime = System.nanoTime();
        for(int i =0; i<2000000; i++){
            hashMap.put(i, "Hello"+i);
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for(int i =0; i<hashMap.size(); i++){
            hashMap.remove("Hello"+i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        System.out.println("Add to HashMap: " + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from HashMap: " + estimatedTime1 / 1000000000.0 + " sec");
    }

    private static void TestLinkedHashMap(){
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        long startTime = System.nanoTime();
        for(int i =0; i<2000000; i++){
            linkedHashMap.put(i, "Hello"+i);
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for(int i =0; i<linkedHashMap.size(); i++){
            linkedHashMap.remove("Hello"+i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        System.out.println("Add to LinkedHashMap: " + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from LinkedHashMap: " + estimatedTime1 / 1000000000.0 + " sec");
    }

    private static void TestTreeMap(){
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        long startTime = System.nanoTime();
        for(int i =0; i<2000000; i++){
            treeMap.put(i, "Hello"+i);
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for(int i =0; i<treeMap.size(); i++){
            treeMap.remove(i);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        System.out.println("Add to TreeMap: " + estimatedTime / 1000000000.0 + " sec, " +
                "Remove from TreeMap: " + estimatedTime1 / 1000000000.0 + " sec");
    }


}
