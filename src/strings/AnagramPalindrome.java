package strings;

import java.util.HashMap;

public class AnagramPalindrome {
    public static boolean canFormPalindrome(String str) {
        // Create a frequency map to count the occurrences of each character
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Populate the frequency map
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Check the number of characters with odd frequencies
        int oddCount = 0;
        for (int count : charCountMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }

            // If more than one character has an odd count, it's not an anagram palindrome
            if (oddCount > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "civic";
        if (canFormPalindrome(input)) {
            System.out.println("The string \"" + input + "\" can be rearranged into a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" cannot be rearranged into a palindrome.");
        }
    }
}
