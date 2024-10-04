package n01_oop_inheritance;

public class Apprentice extends Employee {
    public int yearOfApprenticeship;

    public Apprentice(String name, String birthPlace, String birthDate, int personnelNumber, boolean manager, double salary, int yearOfApprenticeship) {
        super(name, birthPlace, birthDate, personnelNumber, manager, salary);
        this.yearOfApprenticeship = yearOfApprenticeship;
    }
}
