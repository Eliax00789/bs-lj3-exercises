package n03_race;

import java.util.Random;

public abstract class Animal implements Movable {
    public final String name;
    private final float minSpeed;
    private final float maxSpeed;
    private int stamina;

    public Animal(String name, float minSpeed, float maxSpeed, int stamina) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.stamina = stamina;
    }

    public float move() {
        if (this.stamina == 0) {
            return this.minSpeed;
        } else {
            this.stamina--;
            return new Random().nextFloat(this.minSpeed, this.maxSpeed);
        }
    }

    public abstract void makeNoise();
}
