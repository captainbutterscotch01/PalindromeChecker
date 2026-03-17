class PalindromeChecker {

    // Method to check palindrome (encapsulated logic)
    public boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

class MainApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String str = "level";

        if (checker.checkPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}