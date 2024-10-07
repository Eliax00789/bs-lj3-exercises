package n03_animal_race;

import java.util.Random;

public abstract class Animal {
    public final String name;
    private final float minSpeed;
    private final float maxSpeed;
    private final int stamina;

    public Animal(String name, float minSpeed, float maxSpeed, int stamina) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.stamina = stamina;
    }

    public float move() {
        return new Random().nextFloat(this.minSpeed, this.maxSpeed)
                * (10f / this.stamina);
    }

    public abstract void makeNoise();
}
