package sda.basic.java.day2;

public class Ex14 {
    public static void main(String[] args) {
        int[] arrays = {12, -7, 19, -5};
        int lenght = countNegativeDigits(arrays);
        int[] negativeDigits = createArrayWithNegativeDigits(lenght, arrays);
    }

    private static int countNegativeDigits(int[] arrays) {
        int counter = 0;
        for (int i : arrays) {
            if(i < 0){
                counter++;
            }
        }

        return counter;
    }
    private static int[] createArrayWithNegativeDigits(int lenght, int[] arrays) {
        int[] newArray = new int[lenght];
               for (int i = 0, j = 0; i < arrays.length; i++) {
            if (arrays[i] < 0){
                newArray[i] = arrays[i];
                j++;
            }
        }
        return newArray;
    }
}
