package n03_animal_race;

public class Antelope extends Animal {
    public Antelope() {
        super("Antelope", 20, 80, 40);
    }

    @Override
    public void makeNoise() {
        System.out.println("snort");
    }

    public void jump() {
        System.out.println("yeeeee");
    }
}
