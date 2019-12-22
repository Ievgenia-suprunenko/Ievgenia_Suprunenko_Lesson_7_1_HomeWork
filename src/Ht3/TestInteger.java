package Ht3;

public class TestInteger {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(4);
        System.out.println(myInteger.isEven());
        MyInteger myInteger2 = new MyInteger(5);
        System.out.println(myInteger2.isOdd());
        System.out.println(myInteger2.isOdd());
        System.out.println(MyInteger.isEvenStatic(4));
        System.out.println(MyInteger.isOddStatic(5));
        System.out.println(MyInteger.isOddStatic(5));
//        System.out.println(MyInteger.isEvenStaticMyInt());


        MyInteger myInteger3 = new MyInteger(4);
        System.out.println(myInteger3.equals(4));
        System.out.println(MyInteger.parseInt(new char[]{'1', '2', '3'}));
        for (char c : MyInteger.parseString("qwery")) {
            System.out.println(c);
        }
    }
}
