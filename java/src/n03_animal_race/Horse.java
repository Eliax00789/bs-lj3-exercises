package n03_animal_race;

public class Horse extends Animal {
    public Horse() {
        super("Horse", 2, 80, 100);
    }

    @Override
    public void makeNoise() {
        System.out.println("neigh");
    }

    public void throwRider() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
    }
}
