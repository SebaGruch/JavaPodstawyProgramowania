package sda.basic.java.day1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit ");
        int firstDigit = scanner.nextInt();

        System.out.print("Please insert second digit ");
        int secondDigit = scanner.nextInt();

        boolean result;

        result = firstDigit > secondDigit ? true : false;
        System.out.println("If x is greater than y: " + result);

        result = firstDigit * 3 > secondDigit ? true : false;
        System.out.println("If x*3 is greater than y: " + result);

        result = (secondDigit++ < ++firstDigit) && (--firstDigit < secondDigit++);
        System.out.println("If y++ is smaller the ++x and --x is smaller then y++ " + result);

        result = (firstDigit * secondDigit) %2 == 0;
        System.out.println("if x*y is even: " + result);
    }
}