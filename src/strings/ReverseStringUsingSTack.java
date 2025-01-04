package strings;

import java.util.Stack;

public class ReverseStringUsingSTack {

    public static String reverseStringUsingStack(String str){

        char[] reverseString = new char[str.length()];
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()){

            reverseString[count] = stack.pop();
            count++;
        }

        return String.valueOf(reverseString);
    }

    public static void main(String[] args) {

        String str = "GeeksForGeeks";
        System.out.println(reverseStringUsingStack(str));
    }
}
