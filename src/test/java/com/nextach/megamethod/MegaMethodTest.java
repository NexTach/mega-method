package com.nextach.megamethod;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
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
    void testSubtract() {
        assertEquals(5, MegaMethod.subtract(10, 5));
        assertEquals(-5, MegaMethod.subtract(5, 10));
        assertEquals(0, MegaMethod.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(20, MegaMethod.multiply(4, 5));
        assertEquals(-20, MegaMethod.multiply(-4, 5));
        assertEquals(0, MegaMethod.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, MegaMethod.divide(10, 5));
        assertEquals(2.5, MegaMethod.divide(5, 2));
        assertThrows(ArithmeticException.class, () -> MegaMethod.divide(10, 0));
    }

    @Test
    void testModulo() {
        assertEquals(1, MegaMethod.modulo(10, 3));
        assertEquals(0, MegaMethod.modulo(10, 5));
        assertThrows(ArithmeticException.class, () -> MegaMethod.modulo(10, 0));
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

    @Test
    void testFibonacci() {
        assertEquals(0, MegaMethod.fibonacci(0));
        assertEquals(1, MegaMethod.fibonacci(1));
        assertEquals(1, MegaMethod.fibonacci(2));
        assertEquals(2, MegaMethod.fibonacci(3));
        assertEquals(5, MegaMethod.fibonacci(5));
        assertEquals(55, MegaMethod.fibonacci(10));
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.fibonacci(-1));
    }

    @Test
    void testArrayToList() {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, MegaMethod.arrayToList(array));
        assertThrows(NullPointerException.class, () -> MegaMethod.arrayToList(null));
    }

    @Test
    void testToList() {
        List<String> result = MegaMethod.toList("a", "b", "c");
        assertEquals(Arrays.asList("a", "b", "c"), result);
        assertThrows(NullPointerException.class, () -> MegaMethod.toList((String[]) null));
    }

    @Test
    void testSumList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, MegaMethod.sumList(list));
        assertEquals(0, MegaMethod.sumList(Arrays.asList()));
    }

    @Test
    void testProductList() {
        List<Integer> list = Arrays.asList(2, 3, 4);
        assertEquals(24, MegaMethod.productList(list));
        assertEquals(0, MegaMethod.productList(Arrays.asList()));
    }

    @Test
    void testAverageList() {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        assertEquals(6.0, MegaMethod.averageList(list));
        assertThrows(ArithmeticException.class, () -> MegaMethod.averageList(Arrays.asList()));
    }

    @Test
    void testAddLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> expected = Arrays.asList(5, 7, 9);
        assertEquals(expected, MegaMethod.addLists(list1, list2));
    }

    @Test
    void testSubtractLists() {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(5, 10, 15);
        List<Integer> expected = Arrays.asList(5, 10, 15);
        assertEquals(expected, MegaMethod.subtractLists(list1, list2));
    }

    @Test
    void testMultiplyLists() {
        List<Integer> list1 = Arrays.asList(2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7);
        List<Integer> expected = Arrays.asList(10, 18, 28);
        assertEquals(expected, MegaMethod.multiplyLists(list1, list2));
    }

    @Test
    void testDivideLists() {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(2, 4, 5);
        List<Double> expected = Arrays.asList(5.0, 5.0, 6.0);
        assertEquals(expected, MegaMethod.divideLists(list1, list2));
    }

    @Test
    void testAbs() {
        assertEquals(5, MegaMethod.abs(5));
        assertEquals(5, MegaMethod.abs(-5));
        assertEquals(0, MegaMethod.abs(0));
    }

    @Test
    void testMax() {
        assertEquals(10, MegaMethod.max(5, 10));
        assertEquals(10, MegaMethod.max(10, 5));
        assertEquals(5, MegaMethod.max(5, 5));
    }

    @Test
    void testMin() {
        assertEquals(5, MegaMethod.min(5, 10));
        assertEquals(5, MegaMethod.min(10, 5));
        assertEquals(5, MegaMethod.min(5, 5));
    }

    @Test
    void testSquare() {
        assertEquals(25, MegaMethod.square(5));
        assertEquals(0, MegaMethod.square(0));
        assertEquals(9, MegaMethod.square(-3));
    }

    @Test
    void testCube() {
        assertEquals(125, MegaMethod.cube(5));
        assertEquals(0, MegaMethod.cube(0));
        assertEquals(-27, MegaMethod.cube(-3));
    }

    @Test
    void testPower() {
        assertEquals(8, MegaMethod.power(2, 3));
        assertEquals(1, MegaMethod.power(5, 0));
        assertEquals(100, MegaMethod.power(10, 2));
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.power(2, -1));
    }

    @Test
    void testIsEven() {
        assertTrue(MegaMethod.isEven(4));
        assertTrue(MegaMethod.isEven(0));
        assertFalse(MegaMethod.isEven(3));
    }

    @Test
    void testIsOdd() {
        assertTrue(MegaMethod.isOdd(3));
        assertTrue(MegaMethod.isOdd(7));
        assertFalse(MegaMethod.isOdd(4));
    }

    @Test
    void testIsPrime() {
        assertTrue(MegaMethod.isPrime(2));
        assertTrue(MegaMethod.isPrime(7));
        assertTrue(MegaMethod.isPrime(11));
        assertFalse(MegaMethod.isPrime(1));
        assertFalse(MegaMethod.isPrime(4));
        assertFalse(MegaMethod.isPrime(15));
    }

    @Test
    void testFactorial() {
        assertEquals(1, MegaMethod.factorial(0));
        assertEquals(1, MegaMethod.factorial(1));
        assertEquals(120, MegaMethod.factorial(5));
        assertEquals(3628800, MegaMethod.factorial(10));
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.factorial(-1));
    }

    @Test
    void testGcd() {
        assertEquals(5, MegaMethod.gcd(10, 15));
        assertEquals(6, MegaMethod.gcd(12, 18));
        assertEquals(1, MegaMethod.gcd(7, 13));
    }

    @Test
    void testLcm() {
        assertEquals(30, MegaMethod.lcm(10, 15));
        assertEquals(36, MegaMethod.lcm(12, 18));
        assertEquals(0, MegaMethod.lcm(0, 5));
    }

    @Test
    void testReverse() {
        assertEquals("dcba", MegaMethod.reverse("abcd"));
        assertEquals("", MegaMethod.reverse(""));
        assertNull(MegaMethod.reverse(null));
    }

    @Test
    void testLength() {
        assertEquals(5, MegaMethod.length("hello"));
        assertEquals(0, MegaMethod.length(""));
        assertEquals(0, MegaMethod.length(null));
    }

    @Test
    void testIsEmpty() {
        assertTrue(MegaMethod.isEmpty(""));
        assertTrue(MegaMethod.isEmpty(null));
        assertFalse(MegaMethod.isEmpty("hello"));
    }

    @Test
    void testIsBlank() {
        assertTrue(MegaMethod.isBlank(""));
        assertTrue(MegaMethod.isBlank("   "));
        assertTrue(MegaMethod.isBlank(null));
        assertFalse(MegaMethod.isBlank("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", MegaMethod.toUpperCase("hello"));
        assertEquals("HELLO", MegaMethod.toUpperCase("HELLO"));
        assertNull(MegaMethod.toUpperCase(null));
    }

    @Test
    void testToLowerCase() {
        assertEquals("hello", MegaMethod.toLowerCase("HELLO"));
        assertEquals("hello", MegaMethod.toLowerCase("hello"));
        assertNull(MegaMethod.toLowerCase(null));
    }

    @Test
    void testTrim() {
        assertEquals("hello", MegaMethod.trim("  hello  "));
        assertEquals("hello", MegaMethod.trim("hello"));
        assertNull(MegaMethod.trim(null));
    }

    @Test
    void testMaxArray() {
        assertEquals(10, MegaMethod.maxArray(new int[]{1, 5, 10, 3, 7}));
        assertEquals(-1, MegaMethod.maxArray(new int[]{-5, -3, -1}));
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.maxArray(new int[]{}));
    }

    @Test
    void testMinArray() {
        assertEquals(1, MegaMethod.minArray(new int[]{1, 5, 10, 3, 7}));
        assertEquals(-5, MegaMethod.minArray(new int[]{-5, -3, -1}));
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.minArray(new int[]{}));
    }

    @Test
    void testSumArray() {
        assertEquals(26, MegaMethod.sumArray(new int[]{1, 5, 10, 3, 7}));
        assertEquals(0, MegaMethod.sumArray(new int[]{}));
        assertEquals(0, MegaMethod.sumArray(null));
    }

    @Test
    void testAverageArray() {
        assertEquals(5.2, MegaMethod.averageArray(new int[]{1, 5, 10, 3, 7}), 0.01);
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.averageArray(new int[]{}));
    }

    @Test
    void testReverseArray() {
        int[] array = {1, 2, 3, 4, 5};
        MegaMethod.reverseArray(array);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, array);
    }

    @Test
    void testReverseList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversed = MegaMethod.reverseList(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), reversed);
        assertNull(MegaMethod.reverseList(null));
    }

    @Test
    void testClamp() {
        assertEquals(5, MegaMethod.clamp(5, 0, 10));
        assertEquals(0, MegaMethod.clamp(-5, 0, 10));
        assertEquals(10, MegaMethod.clamp(15, 0, 10));
    }

    @Test
    void testGenerateRandomString() {
        int length = 10;
        String randomString = MegaMethod.generateRandomString(length);
        assertNotNull(randomString);
        assertEquals(length, randomString.length());
        for (char c : randomString.toCharArray()) {
            assertTrue(Character.isLetterOrDigit(c));
        }
    }

    @Test
    void testGenerateRandomIntArray() {
        int length = 10;
        int min = 5;
        int max = 15;
        int[] randomArray = MegaMethod.generateRandomIntArray(length, min, max);
        assertNotNull(randomArray);
        assertEquals(length, randomArray.length);
        for (int value : randomArray) {
            assertTrue(value >= min && value < max);
        }
    }

    @Test
    void testGenerateRandomIntArrayWithNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.generateRandomIntArray(-1, 0, 10));
    }

    @Test
    void testGenerateRandomIntArrayWithInvalidRange() {
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.generateRandomIntArray(10, 10, 5));
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.generateRandomIntArray(10, 10, 10));
    }

    @Test
    void testCharToAscii() {
        assertEquals(65, MegaMethod.charToAscii('A'));
        assertEquals(97, MegaMethod.charToAscii('a'));
        assertEquals(48, MegaMethod.charToAscii('0'));
        assertEquals(32, MegaMethod.charToAscii(' '));
    }

    @Test
    void testCharToAsciiWithNonAscii() {
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.charToAscii('한'));
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.charToAscii('信'));
    }

    @Test
    void testStringToAsciiArray() {
        int[] expected = {72, 101, 108, 108, 111};
        assertArrayEquals(expected, MegaMethod.stringToAsciiArray("Hello"));
        assertArrayEquals(new int[]{65, 66, 67}, MegaMethod.stringToAsciiArray("ABC"));
        assertArrayEquals(new int[0], MegaMethod.stringToAsciiArray(null));
        assertArrayEquals(new int[0], MegaMethod.stringToAsciiArray(""));
    }

    @Test
    void testStringToAsciiArrayWithNonAscii() {
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.stringToAsciiArray("Hello한글"));
        assertThrows(IllegalArgumentException.class, () -> MegaMethod.stringToAsciiArray("Test😀"));
    }
}
