package collection;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        // Push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Pushing elements on stack"+stack);

        for (int s: stack){

            System.out.println(s);
        }

        System.out.println("Popping elements :");
        // Popping elements from stack
        while (!stack.isEmpty()){

            int removeELement = stack.pop();
            System.out.println(removeELement);
        }

        System.out.println("Check stack is empty: "+stack.isEmpty());
    }
}
