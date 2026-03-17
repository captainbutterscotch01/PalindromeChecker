import java.util.Stack;

class PalindromeStack {

    public static void main(String[] args) {

        // Original string
        String str = "madam";

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
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