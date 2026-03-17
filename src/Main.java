import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String str);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String str) {
        return strategy.check(str);
    }
}

// Main Class
public class PalindromeApp {

    public static void main(String[] args) {

        String str = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // Switch here
        strategy = new DequeStrategy();
        // strategy = new StackStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        if (context.execute(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}