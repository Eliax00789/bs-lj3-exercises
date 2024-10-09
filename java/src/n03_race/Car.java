package n03_race;

public class Car implements Movable {
    public final String make;
    public final String model;
    private final float minSpeed;
    private final float maxSpeed;
    private float currentSpeed;

    public Car(String make, String model, float minSpeed, float maxSpeed) {
        this.make = make;
        this.model = model;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    @Override
    public float move() {
        if (this.currentSpeed == 0 && minSpeed != 0) {
            this.currentSpeed = this.minSpeed;
        } else if (this.currentSpeed < this.maxSpeed) {
            this.currentSpeed += (this.maxSpeed - this.minSpeed) / 10;
        }
        return this.currentSpeed;
    }
}
