package sda.basic.java.day2;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(ifWorldContainsPrefix("programowanie", "pro"));
        System.out.println(ifWorldContainsPrefix("programowanie", "prol"));

        System.out.println();

        System.out.println(ifWorldContainsSuffix("programowanie", "nie"));
        System.out.println(ifWorldContainsSuffix("programowanie", "prol"));
    }

    private static boolean ifWorldContainsPrefix(String input, String prefix) {
        return input.startsWith(prefix);
    }

    private static boolean ifWorldContainsSuffix(String input, String suffix) {
        return input.endsWith(suffix);
    }
}
