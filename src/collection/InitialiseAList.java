package collection;

import java.util.*;

public class InitialiseAList {

    public static void main(String[] args) {

        // For ArrayList
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(3);
        System.out.println("Array List: "+arrayList);

        // For linkedList
        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(4);
        System.out.println("Linked list: "+linkedList);

        // For Stack
        List<Integer> stackList = new Stack<Integer>();
        stackList.add(3);
        stackList.add(1);
        System.out.println("Stack: "+stackList);

        // DOuble brace initialization
        List<Integer> arrayList2 = new ArrayList<Integer>(){{
            add(1);
            add(3);
        }};
        System.out.println("Array List: "+arrayList2);

        List<Integer> linkedList2 = new LinkedList<Integer>(){{
            add(2);
            add(4);
        }};
        System.out.println("Linked List: "+linkedList2);

        List<Integer> stackList2 = new Stack<>(){{
            add(3);
            add(1);
        }};
        System.out.println("Stack: "+stackList2);

        // Using Arrays.asList(1, 2, 3)
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println("Using Arrays.asList(): "+list.toString());

        // Creating a mutable list using Arrays.asList
        List<Integer> mutableList = new ArrayList<>(Arrays.asList(1, 2, 3));
        mutableList.add(4);
        System.out.println("Mutable list: "+mutableList);

        // Using Collections.addAll()
        List<Integer> addAllList = new ArrayList<Integer>();
        Collections.addAll(addAllList, 3,4,5);
        System.out.println("Add all list: "+addAllList);

        // unmodifiable list
        List<Integer> unmList = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
        System.out.println("Unmodifiable list: "+unmList);

        // Collections.singletonList()
        List<Integer> singletonList = Collections.singletonList(3);
        System.out.println("Singleton List:"+singletonList);
    }
}
