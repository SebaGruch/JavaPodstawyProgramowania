package sda.basic.java.day1;

public class Ex1 {

    public static void main(String[] args) {
        displayWordInHexFormant(); // alt+enter - tworzy metodę
        displayWordInBinaryFormat();
        displayWordInDecimalFormat();

     }
    private static void displayWordInHexFormant() {
        char s = 0x53; // ctrl+d kopiuje linijke
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.println(a);

    }
    private static void displayWordInBinaryFormat() {
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.println(a);

    }
    private static void displayWordInDecimalFormat() {
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.println(a);
    }
}
