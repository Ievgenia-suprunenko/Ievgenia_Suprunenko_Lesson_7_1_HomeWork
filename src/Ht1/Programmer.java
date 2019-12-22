package Ht1;

public class Programmer extends Employee{

    public Programmer(String name, int age, double salary) {
        super(name, age, salary);
    }
    String programmingLanguage;

    public Programmer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void printDatas() {
        super.printData();
        System.out.println("Language: " + programmingLanguage);
    }
}
