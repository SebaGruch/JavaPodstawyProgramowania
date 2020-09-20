package sda.basic.java.day2;

import java.util.Arrays;

public class Ex6666 {
    public static void main(String[] args) {
    int [][] arrays = new int [3][10];
        for (int i = 0; i < 10; i++) {
            arrays[0][i] = i + 1;
            arrays[1][i] = arrays[0][i] * arrays[0][i];
            arrays[2][i] = arrays[1][i] * arrays[0][i];
        }

        for(int[] a: arrays)
            System.out.println(Arrays.toString(a));
        }
    }

