import java.util.*;

class StackVsQueuePalindrome {

    public static void main(String[] args) {

        // Original string
        String str = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        for (int i = 0; i < str.length(); i++) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}