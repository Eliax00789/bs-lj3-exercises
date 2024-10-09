package n03_race;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Movable, Float> raceState = new HashMap<>(Map.ofEntries(
                Map.entry(new Antelope(), 0f),
                Map.entry(new Horse(), 0f),
                Map.entry(new Lion(), 0f),
                Map.entry(new Wolf(), 0f),

                Map.entry(new Alien("Balaho", "Unggoy", 0, 2), 0f),
                Map.entry(new Car("Volkswagen", "T1", 0, 80), 0f),
                Map.entry(new Human("John Doe", 42), 0f),
                Map.entry(new Robot("Boston Dynamics", "Spot", 0, 15), 0f)
        ));

        while_race:
        while (true) {
            for (Map.Entry<Movable, Float> entry : raceState.entrySet()) {
                Movable movable = entry.getKey();
                float newPosition = Math.min(entry.getValue() + movable.move(), 1000);
                raceState.put(movable, newPosition);

                if (newPosition == 1000) {
                    Main.congratulate(movable);
                    break while_race;
                }
            }
        }

        for (Map.Entry<Movable, Float> entry : raceState.entrySet()) {
            System.out.println(entry.getKey().getClass().getSimpleName() + ": " + entry.getValue());
        }
    }

    private static void congratulate(Movable movable) {
        String winner = switch (movable) {
            case Alien alien -> alien.name + " from " + alien.planet;
            case Car car -> car.make + " " + car.model;
            case Human human -> human.name + " (" + human.age + ")";
            case Robot robot -> robot.make + " " + robot.model;
            case Animal animal -> animal.name;
            default -> throw new IllegalStateException("Unexpected value: " + movable);
        };
        System.out.println("Winner: " + winner);
        if (movable instanceof Animal animal) {
            System.out.print("Noise: ");
            animal.makeNoise();
        }
        System.out.println();
    }
}
