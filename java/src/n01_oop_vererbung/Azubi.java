package n01_oop_vererbung;

public class Azubi extends Mitarbeiter {
    public int lehrjahr;

    public Azubi(String name, String gebOrt, String gebDat, int personalNummer, boolean fuehrungskraft, double gehalt, int lehrjahr) {
        super(name, gebOrt, gebDat, personalNummer, fuehrungskraft, gehalt);
        this.lehrjahr = lehrjahr;
    }
}
