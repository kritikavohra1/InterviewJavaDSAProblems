package collection;

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        // Adding elements to arrayList
        al.add("geeks");
        al.add("geeks");

        System.out.println("Original array list: "+al);

        // Adding elements at specific index
        al.add(1, "For");
        System.out.println("Modified list:"+al);

        // Deletion of element

        // Delete using index
        al.remove(1);
        System.out.println("After removing an element");
        System.out.println("After deleting an element: "+al);

        // Delete using value
        al.remove("geeks");
        System.out.println("After deleting using value: "+al);

        // Updating values
        // Updating value at index 0
        al.set(0, "GFG");
        System.out.println(al);
    }
}
