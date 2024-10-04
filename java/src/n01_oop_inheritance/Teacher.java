package n01_oop_inheritance;

public class Teacher extends Person {
    public String mainSubject;

    public Teacher(String name, String birthPlace, String birthDate, String mainSubject) {
        super(name, birthPlace, birthDate);
        this.mainSubject = mainSubject;
    }
}
