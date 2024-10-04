package n03_animal_race;

public class Lion extends Animal {
    public Lion() {
        super("Lion", 5, 60, 60);
    }

    @Override
    public void makeNoise() {
        System.out.println("roar");
    }
}
