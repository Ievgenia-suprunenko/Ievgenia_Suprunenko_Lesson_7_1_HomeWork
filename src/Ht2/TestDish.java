package Ht2;

import java.util.Scanner;

public class TestDish {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter dish amount: ");
        int dishAmount = a.nextInt();
        for (int i = 0; i<dishAmount; i++){
            createDish();
        }
        System.out.println("Total dishes callory is: " + Dish.caloryCounter);
    }

    public static void createDish (){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter dish type (Vegetables or Meat): ");
        String dishType = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter " + dishType + " name: ");
        String dishName = b.nextLine();
        Scanner c = new Scanner(System.in);
        System.out.print("Enter dish calory: ");
        int dishCalory = c.nextInt();
        if (dishType.equals("Vegetables")){
            Vegetables vegetables = new Vegetables(dishName, dishCalory);
            return;
        } else if (dishType.equals("Meat")){
            Meat meat = new Meat(dishName, dishCalory);
            return;
        } else {
            System.out.println("You entered unexistend dish");
        }
    }
}
