package n01_oop_vererbung;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Max Mustermann", "Musterstadt", "Musterdatum");
        Lehrer lehrer = new Lehrer("Max Mustermann", "Musterstadt", "Musterdatum", "Musterfach");
        Schueler schueler = new Schueler("Max Mustermann", "Musterstadt", "Musterdatum", "Musterbildungsabschluss", 1.0f);
        Mitarbeiter mitarbeiter = new Mitarbeiter("Max Mustermann", "Musterstadt", "Musterdatum", 1234, false, -5.0);
        Azubi azubi = new Azubi("Max Mustermann", "Musterstadt", "Musterdatum", 1234, false, -10.0, 3);
    }
}
