package nefedov.mycollection;


import java.util.Iterator;

public class MainClass {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Kate");
        myLinkedList.add("Alex");
        myLinkedList.add("Ksu");
        myLinkedList.add("Helen");
        myLinkedList.add("Dmitri");
        myLinkedList.addFirst("Hi");

        System.out.println("1). Test method add and size");
        System.out.println("Size: " + myLinkedList.size());
        for(int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println("------------------------------");
        System.out.println("2). Test method add(index, element)");
        myLinkedList.add(0, "Gleb");
        myLinkedList.add(0, "Artem");
        myLinkedList.add(myLinkedList.size()-1, "Evgeniy");

        System.out.println("Size: " + myLinkedList.size());

        for(int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println("-------------------------");
        System.out.println("3). Test method indexOf(element)");
        System.out.println("Index of element Kate: " +myLinkedList.indexOf("Kate"));

        System.out.println("-------------------------");
        System.out.println("4). Test method delete(index)");
        System.out.println("Delete:" + myLinkedList.remove(8));
        System.out.println(myLinkedList.size());
        for(int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println("-------------------------");
        System.out.println("5). Test method set(index, element)");
        System.out.println("Changed element: " + myLinkedList.set(4, "hellisad"));
        System.out.println(myLinkedList.size());
        for(int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println("-------------------------");
        System.out.println("6). Test method toArray(arr[])");
        String[] mas = new String[myLinkedList.size()];
        myLinkedList.toArray(mas);

        System.out.println("Array:");
        for (int i =0; i < mas.length; i++){
            System.out.println(mas[i]);
        }

        System.out.println("-------------------------");
        System.out.println("7). Test method toString()");
        System.out.println(myLinkedList);

        System.out.println("-------------------------");
        System.out.println("8). Test method toArray(element)");
        Object[] arr1 = myLinkedList.toArray();
        for(int i =0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("-------------------------");
        System.out.println("9). Test forEach");
        myLinkedList.forEach(System.out::println);

        System.out.println("-------------------------");
        System.out.println("10). Test Iterator");
        Iterator<String> it = myLinkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }


}
