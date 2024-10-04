package n01_oop_inheritance;

public class Employee extends Person {
    public int personnelNumber;
    public boolean manager;
    public double salary;

    public Employee(String name, String birthPlace, String birthDate, int personnelNumber, boolean manager, double salary) {
        super(name, birthPlace, birthDate);
        this.personnelNumber = personnelNumber;
        this.manager = manager;
        this.salary = salary;
    }
}
