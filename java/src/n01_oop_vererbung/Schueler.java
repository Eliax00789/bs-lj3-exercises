package n01_oop_vererbung;

public class Schueler extends Person {
    public String bildungsabscluss;
    public float notendurchschnitt;

    public Schueler(String name, String gebOrt, String gebDat, String bildungsabschluss, float notendurchschnitt) {
        super(name, gebOrt, gebDat);
        this.bildungsabscluss = bildungsabschluss;
        this.notendurchschnitt = notendurchschnitt;
    }
}
