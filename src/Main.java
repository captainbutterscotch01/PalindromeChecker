class PalindromeIgnoreCaseSpace {

    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        // Two-pointer check
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
