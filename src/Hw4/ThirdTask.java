package Hw4;

public class ThirdTask {
    public static void main(String[] args) {
        String value = "Anna";

        if (isPalindrome(value)) {
            System.out.println("The value is palindrome.");
        } else {
            System.out.println("The value is not palindrome.");
        }
    }

    static boolean isPalindrome(String text) {
        text = text.toLowerCase();
        char[] textChars = text.toCharArray();
        String reversedText = "";

        for (int i = text.length() - 1; i >= 0 ; i--) {
            reversedText = reversedText + textChars[i];
        }

        return text.equals(reversedText);
    }
}
