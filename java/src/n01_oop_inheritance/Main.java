package n01_oop_inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "Example city", "Example date");
        Teacher teacher = new Teacher("John Doe", "Example city", "Example date", "Example subject");
        Pupil pupil = new Pupil("John Doe", "Example city", "Example date", "Example education", 1.0f);
        Employee employee = new Employee("John Doe", "Example city", "Example date", 1234, false, -5.0);
        Apprentice apprentice = new Apprentice("John Doe", "Example city", "Example date", 1234, false, -10.0, 3);
    }
}
