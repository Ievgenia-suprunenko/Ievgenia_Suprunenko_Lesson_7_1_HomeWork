package Ht1;

public abstract class Shape {
    public void draw (){
        System.out.println("Draw Shape");
    }
    public void erase (){
        System.out.println("Erase Shape");
    }

    public abstract void draw(Circle shape);

    public abstract void erase(Circle shape);
}
