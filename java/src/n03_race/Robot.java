package n03_race;

public class Robot implements Movable {
    public final String make;
    public final String model;
    private final float minSpeed;
    private final float maxSpeed;

    public Robot(String make, String model, float minSpeed, float maxSpeed) {
        this.make = make;
        this.model = model;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public float move() {
        return this.maxSpeed;
    }
}
