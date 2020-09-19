package sda.basic.java.day1;

import java.util.Scanner;

public class Ex2 {
    
    private final static float PI = 3.14f; 
    
    public static void main(String[] args) {
      float diameter = getDiameterFromUser();

      float circumference = calculateCircumeference(diameter);
        System.out.println("Circumference Of a Circle: " + circumference);

        float area = CalculateOfArea(diameter);
        System.out.println("Area Of a Circle: " + area);

    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static float calculateCircumeference(float diameter) {
        //2pi r pi * d
        return PI * diameter;

    }

    private static float CalculateOfArea(float diameter) {
      float radius = diameter / 2;
        return PI * (float)Math.pow(radius, 2);

    }

}