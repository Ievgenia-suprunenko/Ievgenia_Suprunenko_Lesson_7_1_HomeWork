package Ht1;

public class DatabasePro extends Employee {

    public DatabasePro(String name, int age, double salary) {
        super(name, age, salary);
    }
    String databaseTool;

    public DatabasePro(String name, int age, double salary, String databaseTool) {
        super(name, age, salary);
        this.databaseTool = databaseTool;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println(databaseTool);
    }
}
