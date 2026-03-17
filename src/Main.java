class PalindromeCheck {

    public static void main(String[] args) {

        // Original string
        String str = "level";
        String reversed = "";

        // Reverse using for loop
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Compare original and reversed
        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}