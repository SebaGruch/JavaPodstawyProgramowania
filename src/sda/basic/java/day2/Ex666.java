package sda.basic.java.day2;

public class Ex666 {

    public static void main(String[] args) {
        int [][] arrays = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = arrays[0][0]
                + arrays[1][1]
                + arrays[2][2]
                + arrays[0][2]
                + arrays[1][1]
                + arrays[2][0];
        int sum = arrays[0][0]
                + arrays[0][1]
                + arrays[0][2]
                + arrays[1][0]
                + arrays[1][1]
                + arrays[1][2]
                + arrays[2][0]
                + arrays[2][1]
                + arrays[2][2];



    }
}
