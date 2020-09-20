package sda.basic.java.day2;

public class Ex8 {

    private static final int VALUE_A_ASCII = 65;
    private static final int DIFF_UPPER_AND_LOWER_ASCII = 32;


    public static void main(String[] args) {
        System.out.println(replaceChars("AlA mA kOtA!"));


    }

    private static String replaceChars(String input) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if(character  >= VALUE_A_ASCII && character <= 90){
                result.append((char)(character + DIFF_UPPER_AND_LOWER_ASCII));
            } else if (character >= 97 && character <= 122){
                result.append((char)(character - DIFF_UPPER_AND_LOWER_ASCII));
            } else {
                result.append(character);
            }


        }
        return result.toString();
    }
}
