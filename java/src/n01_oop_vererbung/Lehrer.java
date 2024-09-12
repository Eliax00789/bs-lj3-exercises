package n01_oop_vererbung;

public class Lehrer extends Person {
    public String hauptfach;

    public Lehrer(String name, String gebOrt, String gebDat, String hauptfach) {
        super(name, gebOrt, gebDat);
        this.hauptfach = hauptfach;
    }
}
