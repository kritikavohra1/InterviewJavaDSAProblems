package collection;

import java.util.Stack;

public class StackOperations {

    public static void pushElements(Stack<Integer> stack){

        for (int i = 0; i<5; i++){

            System.out.println(stack.push(i));
        }
    }

    public static void peekElement(Stack<Integer> stack){

        System.out.println("Element an stack top: "+stack.peek());
    }

    public static void searchElement(Stack<Integer> stack, int element){

        int position = stack.search(element);

        if (position == -1){
            System.out.println("Element found at position: "+position);
        }else {
            System.out.println("Element not found");
        }

    }

    public static void popElement(Stack<Integer> stack){

        while (!stack.isEmpty()){

            int element = stack.pop();
            System.out.println("Element removed: "+element);
        }
    }
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        pushElements(stack);
        peekElement(stack);
        searchElement(stack, 1);
        searchElement(stack, 7);
        popElement(stack);
    }
}
