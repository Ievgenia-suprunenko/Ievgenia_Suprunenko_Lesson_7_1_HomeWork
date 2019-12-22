package Ht3;

public class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        return (value % value == 0) && (value % 1 == 0);
    }

    public static boolean isEvenStatic(int a) {
        return a % 2 == 0;
    }

    public static boolean isOddStatic(int a) {
        return a % 2 != 0;
    }

    public static boolean isPrimeStatic(int a) {
        return (a % a == 0) && (a % 1 == 0);
    }
//    public static boolean isEvenStaticMyInt(){
//        return  % 2 == 0;
//    }

    public boolean equals(int i) {
        return i == value;
    }

    public static int parseInt(char[]digits){
        int number = Integer.parseInt(String.valueOf(digits));
        return number;
    }
    public static char[] parseString(String a){
        char[] ch = a.toCharArray();

        // Printing array
        return  ch;
    }
}
