package n03_animal_race;

public class Wolf extends Animal {
    public Wolf() {
        super("Wolf", 8, 70, 50);
    }

    @Override
    public void makeNoise() {
        System.out.println("howl");
    }
}
