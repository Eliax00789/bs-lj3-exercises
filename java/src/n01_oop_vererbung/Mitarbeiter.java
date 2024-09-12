package n01_oop_vererbung;

public class Mitarbeiter extends Person {
    public int personalNummer;
    public boolean fuehrungskraft;
    public double gehalt;

    public Mitarbeiter(String name, String gebOrt, String gebDat, int personalNummer, boolean fuehrungskraft, double gehalt) {
        super(name, gebOrt, gebDat);
        this.personalNummer = personalNummer;
        this.fuehrungskraft = fuehrungskraft;
        this.gehalt = gehalt;
    }
}
