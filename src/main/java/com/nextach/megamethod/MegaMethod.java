package com.nextach.megamethod;

/**
 * MegaMethod - A collection of utility methods.
 * This is a sample class to demonstrate the project structure.
 */
public class MegaMethod {

    /**
     * Returns a greeting message.
     *
     * @param name the name to greet
     * @return a greeting message
     */
    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Checks if a string is a palindrome.
     *
     * @param text the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private MegaMethod() {
        // Utility class, prevent instantiation
    }
}
