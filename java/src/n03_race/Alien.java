package n03_race;

import java.util.Random;

public class Alien implements Movable {
    public final String planet;
    public final String name;
    private final float minSpeed;
    private final float maxSpeed;

    public Alien(String planet, String name, float minSpeed, float maxSpeed) {
        this.planet = planet;
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public float move() {
        return new Random().nextFloat(this.minSpeed, this.maxSpeed);
    }
}
