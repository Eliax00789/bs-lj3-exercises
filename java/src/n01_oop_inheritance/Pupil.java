package n01_oop_inheritance;

public class Pupil extends Person {
    public String education;
    public float gradeAverage;

    public Pupil(String name, String gebOrt, String gebDat, String education, float gradeAverage) {
        super(name, gebOrt, gebDat);
        this.education = education;
        this.gradeAverage = gradeAverage;
    }
}
