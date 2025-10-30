package com.nextach.megamethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * MegaMethod - 다양한 유틸리티 메서드 모음
 *
 * <p>이 클래스는 여러 가지 편리한 유틸리티 메서드를 제공합니다.
 * 모든 메서드는 정적(static)이며, 인스턴스화할 수 없습니다.</p>
 *
 * @author NexTach
 * @version 1.0.0
 * @since 1.0.0
 */
public class MegaMethod {

    /**
     * 인사 메시지를 생성합니다.
     * <p>주어진 이름에 대한 인사 메시지를 반환합니다.
     * 이름이 null이거나 공백인 경우 기본 인사 메시지를 반환합니다.</p>
     * @param name 인사할 이름 (null 또는 빈 문자열 가능)
     * @return 생성된 인사 메시지
     */
    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }

    /**
     * 두 정수를 더합니다.
     * <p>주어진 두 정수의 합을 계산하여 반환합니다.</p>
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return a와 b의 합
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 두 정수를 뺍니다.
     * <p>첫 번째 정수에서 두 번째 정수를 뺀 결과를 반환합니다.</p>
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return a에서 b를 뺀 값
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * 두 정수를 곱합니다.
     * <p>주어진 두 정수의 곱을 계산하여 반환합니다.</p>
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return a와 b의 곱
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 두 정수를 나눕니다.
     * <p>첫 번째 정수를 두 번째 정수로 나눈 결과를 반환합니다.</p>
     * @param a 첫 번째 정수 (피제수)
     * @param b 두 번째 정수 (제수)
     * @return a를 b로 나눈 몫
     * @throws ArithmeticException b가 0인 경우
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        return (double) a / b;
    }

    /**
     * 두 정수의 나머지를 계산합니다.
     * <p>첫 번째 정수를 두 번째 정수로 나눈 나머지를 반환합니다.</p>
     * @param a 첫 번째 정수 (피제수)
     * @param b 두 번째 정수 (제수)
     * @return a를 b로 나눈 나머지
     * @throws ArithmeticException b가 0인 경우
     */
    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        return a % b;
    }

    /**
     * 문자열이 회문(palindrome)인지 확인합니다.
     * <p>회문은 앞에서 읽으나 뒤에서 읽으나 동일한 문자열을 의미합니다.
     * 공백은 무시되며, 대소문자를 구분하지 않습니다.</p>
     * @param text 검사할 문자열 (null 가능)
     * @return 회문이면 true, 아니면 false. null인 경우 false를 반환
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

    /**
     * 피보나치 수열의 n번째 항을 계산합니다.
     * <p>피보나치 수열은 0, 1로 시작하며, 이후 각 항은 앞의 두 항의 합입니다.</p>
     * @param n 계산할 항의 위치 (0부터 시작)
     * @return n번째 피보나치 수
     * @throws IllegalArgumentException n이 음수인 경우
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n은 0 이상이어야 합니다");
        }
        if (n <= 1) {
            return n;
        }
        long prev = 0;
        long curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    /**
     * 정수 배열을 리스트로 변환합니다.
     * <p>주어진 정수 배열을 List&lt;Integer&gt;로 변환하여 반환합니다.</p>
     * @param array 변환할 정수 배열
     * @return 배열 요소를 포함하는 리스트
     * @throws NullPointerException array가 null인 경우
     */
    public static List<Integer> arrayToList(int[] array) {
        if (array == null) {
            throw new NullPointerException("배열은 null일 수 없습니다");
        }
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        return list;
    }

    /**
     * 제네릭 배열을 리스트로 변환합니다.
     * <p>주어진 배열을 List로 변환하여 반환합니다.</p>
     * @param <T> 배열 요소의 타입
     * @param array 변환할 배열
     * @return 배열 요소를 포함하는 리스트
     * @throws NullPointerException array가 null인 경우
     */
    @SafeVarargs
    public static <T> List<T> toList(T... array) {
        if (array == null) {
            throw new NullPointerException("배열은 null일 수 없습니다");
        }
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * 리스트의 모든 정수 요소를 더합니다.
     * <p>리스트에 있는 모든 정수의 합을 계산하여 반환합니다.</p>
     * @param list 합을 계산할 정수 리스트
     * @return 리스트 요소들의 합
     * @throws NullPointerException list가 null인 경우
     */
    public static int sumList(List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("리스트는 null일 수 없습니다");
        }
        int sum = 0;
        for (Integer value : list) {
            if (value != null) {
                sum += value;
            }
        }
        return sum;
    }

    /**
     * 리스트의 모든 정수 요소를 곱합니다.
     * <p>리스트에 있는 모든 정수의 곱을 계산하여 반환합니다.</p>
     * @param list 곱을 계산할 정수 리스트
     * @return 리스트 요소들의 곱
     * @throws NullPointerException list가 null인 경우
     */
    public static int productList(List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("리스트는 null일 수 없습니다");
        }
        if (list.isEmpty()) {
            return 0;
        }
        int product = 1;
        for (Integer value : list) {
            if (value != null) {
                product *= value;
            }
        }
        return product;
    }

    /**
     * 리스트의 모든 정수 요소의 평균을 계산합니다.
     * <p>리스트에 있는 모든 정수의 평균을 계산하여 반환합니다.</p>
     * @param list 평균을 계산할 정수 리스트
     * @return 리스트 요소들의 평균
     * @throws NullPointerException list가 null인 경우
     * @throws ArithmeticException list가 비어있는 경우
     */
    public static double averageList(List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("리스트는 null일 수 없습니다");
        }
        if (list.isEmpty()) {
            throw new ArithmeticException("빈 리스트의 평균을 계산할 수 없습니다");
        }
        return (double) sumList(list) / list.size();
    }

    /**
     * 두 리스트의 요소별 덧셈을 수행합니다.
     * <p>두 리스트의 같은 인덱스에 있는 요소끼리 더한 결과 리스트를 반환합니다.</p>
     * @param list1 첫 번째 정수 리스트
     * @param list2 두 번째 정수 리스트
     * @return 요소별 덧셈 결과 리스트
     * @throws NullPointerException list1 또는 list2가 null인 경우
     * @throws IllegalArgumentException 두 리스트의 크기가 다른 경우
     */
    public static List<Integer> addLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new NullPointerException("리스트는 null일 수 없습니다");
        }
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("두 리스트의 크기가 같아야 합니다");
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            Integer val1 = list1.get(i);
            Integer val2 = list2.get(i);
            if (val1 != null && val2 != null) {
                result.add(val1 + val2);
            } else {
                result.add(null);
            }
        }
        return result;
    }

    /**
     * 두 리스트의 요소별 뺄셈을 수행합니다.
     * <p>두 리스트의 같은 인덱스에 있는 요소끼리 뺀 결과 리스트를 반환합니다.</p>
     * @param list1 첫 번째 정수 리스트
     * @param list2 두 번째 정수 리스트
     * @return 요소별 뺄셈 결과 리스트
     * @throws NullPointerException list1 또는 list2가 null인 경우
     * @throws IllegalArgumentException 두 리스트의 크기가 다른 경우
     */
    public static List<Integer> subtractLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new NullPointerException("리스트는 null일 수 없습니다");
        }
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("두 리스트의 크기가 같아야 합니다");
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            Integer val1 = list1.get(i);
            Integer val2 = list2.get(i);
            if (val1 != null && val2 != null) {
                result.add(val1 - val2);
            } else {
                result.add(null);
            }
        }
        return result;
    }

    /**
     * 두 리스트의 요소별 곱셈을 수행합니다.
     * <p>두 리스트의 같은 인덱스에 있는 요소끼리 곱한 결과 리스트를 반환합니다.</p>
     * @param list1 첫 번째 정수 리스트
     * @param list2 두 번째 정수 리스트
     * @return 요소별 곱셈 결과 리스트
     * @throws NullPointerException list1 또는 list2가 null인 경우
     * @throws IllegalArgumentException 두 리스트의 크기가 다른 경우
     */
    public static List<Integer> multiplyLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new NullPointerException("리스트는 null일 수 없습니다");
        }
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("두 리스트의 크기가 같아야 합니다");
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            Integer val1 = list1.get(i);
            Integer val2 = list2.get(i);
            if (val1 != null && val2 != null) {
                result.add(val1 * val2);
            } else {
                result.add(null);
            }
        }
        return result;
    }

    /**
     * 두 리스트의 요소별 나눗셈을 수행합니다.
     * <p>두 리스트의 같은 인덱스에 있는 요소끼리 나눈 결과 리스트를 반환합니다.</p>
     * @param list1 첫 번째 정수 리스트
     * @param list2 두 번째 정수 리스트
     * @return 요소별 나눗셈 결과 리스트
     * @throws NullPointerException list1 또는 list2가 null인 경우
     * @throws IllegalArgumentException 두 리스트의 크기가 다른 경우
     * @throws ArithmeticException list2에 0이 포함된 경우
     */
    public static List<Double> divideLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new NullPointerException("리스트는 null일 수 없습니다");
        }
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("두 리스트의 크기가 같아야 합니다");
        }
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            Integer val1 = list1.get(i);
            Integer val2 = list2.get(i);
            if (val1 != null && val2 != null) {
                if (val2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다");
                }
                result.add((double) val1 / val2);
            } else {
                result.add(null);
            }
        }
        return result;
    }

    /**
     * 숫자의 절댓값을 반환합니다.
     * @param n 정수
     * @return n의 절댓값
     */
    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    /**
     * 두 숫자 중 큰 값을 반환합니다.
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return a와 b 중 큰 값
     */
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * 두 숫자 중 작은 값을 반환합니다.
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return a와 b 중 작은 값
     */
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    /**
     * 숫자의 제곱을 계산합니다.
     * @param n 정수
     * @return n의 제곱
     */
    public static int square(int n) {
        return n * n;
    }

    /**
     * 숫자의 세제곱을 계산합니다.
     * @param n 정수
     * @return n의 세제곱
     */
    public static int cube(int n) {
        return n * n * n;
    }

    /**
     * 거듭제곱을 계산합니다.
     * @param base 밑
     * @param exponent 지수
     * @return base의 exponent 제곱
     */
    public static long power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("지수는 0 이상이어야 합니다");
        }
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    /**
     * 숫자가 짝수인지 확인합니다.
     * @param n 정수
     * @return 짝수면 true, 아니면 false
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * 숫자가 홀수인지 확인합니다.
     * @param n 정수
     * @return 홀수면 true, 아니면 false
     */
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    /**
     * 숫자가 소수인지 확인합니다.
     * @param n 정수
     * @return 소수면 true, 아니면 false
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 팩토리얼을 계산합니다.
     * @param n 정수 (0 이상)
     * @return n!
     * @throws IllegalArgumentException n이 음수인 경우
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n은 0 이상이어야 합니다");
        }
        if (n <= 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * 최대공약수(GCD)를 계산합니다.
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return a와 b의 최대공약수
     */
    public static int gcd(int a, int b) {
        a = abs(a);
        b = abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * 최소공배수(LCM)를 계산합니다.
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return a와 b의 최소공배수
     */
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return abs(a * b) / gcd(a, b);
    }

    /**
     * 문자열을 뒤집습니다.
     * @param str 뒤집을 문자열
     * @return 뒤집힌 문자열
     */
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * 문자열의 길이를 반환합니다.
     * @param str 문자열
     * @return 문자열의 길이, null이면 0
     */
    public static int length(String str) {
        return str == null ? 0 : str.length();
    }

    /**
     * 문자열이 비어있는지 확인합니다.
     * @param str 문자열
     * @return 비어있으면 true, 아니면 false
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * 문자열이 공백만 포함하는지 확인합니다.
     * @param str 문자열
     * @return 공백만 포함하면 true, 아니면 false
     */
    public static boolean isBlank(String str) {
        return str == null || str.isBlank();
    }

    /**
     * 문자열을 대문자로 변환합니다.
     * @param str 문자열
     * @return 대문자로 변환된 문자열
     */
    public static String toUpperCase(String str) {
        return str == null ? null : str.toUpperCase();
    }

    /**
     * 문자열을 소문자로 변환합니다.
     * @param str 문자열
     * @return 소문자로 변환된 문자열
     */
    public static String toLowerCase(String str) {
        return str == null ? null : str.toLowerCase();
    }

    /**
     * 문자열의 앞뒤 공백을 제거합니다.
     * @param str 문자열
     * @return 공백이 제거된 문자열
     */
    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

    /**
     * 배열의 최댓값을 찾습니다.
     * @param array 정수 배열
     * @return 배열의 최댓값
     * @throws IllegalArgumentException 배열이 비어있는 경우
     */
    public static int maxArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("배열이 비어있습니다");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 배열의 최솟값을 찾습니다.
     * @param array 정수 배열
     * @return 배열의 최솟값
     * @throws IllegalArgumentException 배열이 비어있는 경우
     */
    public static int minArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("배열이 비어있습니다");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * 배열의 합을 계산합니다.
     * @param array 정수 배열
     * @return 배열 요소들의 합
     */
    public static int sumArray(int[] array) {
        if (array == null) return 0;
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    /**
     * 배열의 평균을 계산합니다.
     * @param array 정수 배열
     * @return 배열 요소들의 평균
     * @throws IllegalArgumentException 배열이 비어있는 경우
     */
    public static double averageArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("배열이 비어있습니다");
        }
        return (double) sumArray(array) / array.length;
    }

    /**
     * 배열을 역순으로 정렬합니다.
     * @param array 정수 배열
     */
    public static void reverseArray(int[] array) {
        if (array == null) return;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * 리스트를 역순으로 반환합니다.
     * @param list 리스트
     * @param <T> 리스트 요소의 타입
     * @return 역순으로 정렬된 새 리스트
     */
    public static <T> List<T> reverseList(List<T> list) {
        if (list == null) return null;
        List<T> reversed = new ArrayList<>(list);
        java.util.Collections.reverse(reversed);
        return reversed;
    }

    /**
     * 숫자를 범위 내로 제한합니다.
     * @param value 값
     * @param min 최솟값
     * @param max 최댓값
     * @return min과 max 사이로 제한된 값
     */
    public static int clamp(int value, int min, int max) {
        if (value < min) return min;
        return Math.min(value, max);
    }

    /**
     * 유틸리티 클래스이므로 인스턴스화를 방지합니다.
     */
    private MegaMethod() {
        // 유틸리티 클래스, 인스턴스화 방지
    }
}
