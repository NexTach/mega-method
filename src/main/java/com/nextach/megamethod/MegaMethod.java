package com.nextach.megamethod;

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
     * 유틸리티 클래스이므로 인스턴스화를 방지합니다.
     */
    private MegaMethod() {
        // 유틸리티 클래스, 인스턴스화 방지
    }
}
