package sda.basic.java.day1;

public class Ex6 {
    public static void main(String[] args) {
        printMultiplicationTable(6, 0, 5);

        for (int i = 1; i <= 4; i++){
            System.out.println();
            System.out.print("5 * " + i + " = " + 5*i);
        }

    }    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for (; minMultiplicand <= maxMultiplicand; minMultiplicand++){
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
        }
    }
}
