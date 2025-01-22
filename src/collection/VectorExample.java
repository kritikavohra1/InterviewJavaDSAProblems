package collection;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<Integer>(3, 2);

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);

        vector.insertElementAt(0, 1);

        vector.removeElement(2);

        for (int v: vector){
            System.out.println(v);
        }

    }
}
