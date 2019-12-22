package Ht1;

public class Person {
    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void printPerson (){
        System.out.println(name +" is "+ age + " years old.");
    }
}
