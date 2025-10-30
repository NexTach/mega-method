package com.nextach.megamethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for MegaMethod.
 */
class MegaMethodTest {

    @Test
    void testGreetWithName() {
        assertEquals("Hello, John!", MegaMethod.greet("John"));
    }

    @Test
    void testGreetWithNull() {
        assertEquals("Hello, World!", MegaMethod.greet(null));
    }

    @Test
    void testGreetWithEmptyString() {
        assertEquals("Hello, World!", MegaMethod.greet(""));
    }

    @Test
    void testGreetWithBlankString() {
        assertEquals("Hello, World!", MegaMethod.greet("   "));
    }

    @Test
    void testAdd() {
        assertEquals(5, MegaMethod.add(2, 3));
        assertEquals(0, MegaMethod.add(-5, 5));
        assertEquals(-10, MegaMethod.add(-5, -5));
    }

    @Test
    void testIsPalindromeWithValidPalindrome() {
        assertTrue(MegaMethod.isPalindrome("racecar"));
        assertTrue(MegaMethod.isPalindrome("A man a plan a canal Panama"));
        assertTrue(MegaMethod.isPalindrome("noon"));
    }

    @Test
    void testIsPalindromeWithNonPalindrome() {
        assertFalse(MegaMethod.isPalindrome("hello"));
        assertFalse(MegaMethod.isPalindrome("world"));
    }

    @Test
    void testIsPalindromeWithNull() {
        assertFalse(MegaMethod.isPalindrome(null));
    }

    @Test
    void testIsPalindromeWithEmptyString() {
        assertTrue(MegaMethod.isPalindrome(""));
    }
}
