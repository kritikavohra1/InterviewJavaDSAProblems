package collection;

import java.util.LinkedList;

public class LinkedListOperations {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add(4,"Five");
        linkedList.set(2, "THREE");
        System.out.println("Linked List: "+linkedList);

        System.out.println("Size of linked list: "+linkedList.size());

        for (int i = 0; i<linkedList.size(); i++){
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println(" ");

        // remove
        linkedList.remove("Two");
        linkedList.remove(2);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked List: "+linkedList);

    }
}
