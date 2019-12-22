package Ht5;

public class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

//    public double getArea(){      where is Programming Exercise 2.19?
//        return
//    }

    public double getPerimetr() {
        return  side1 + side2 + side3;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side 3 = " + side3;
    }
}
