package n03_animal_race;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Animal, Float> raceState = new HashMap<>(Map.ofEntries(
                Map.entry(new Antelope(), 0f),
                Map.entry(new Horse(), 0f),
                Map.entry(new Lion(), 0f),
                Map.entry(new Wolf(), 0f)
        ));

        while_race:
        while (true) {
            for (Map.Entry<Animal, Float> entry : raceState.entrySet()) {
                Animal animal = entry.getKey();
                float newPosition = Math.min(entry.getValue() + animal.move(), 1000);
                raceState.put(animal, newPosition);

                if (newPosition == 1000) {
                    Main.congratulate(animal);
                    break while_race;
                }
            }
        }

        for (Map.Entry<Animal, Float> entry : raceState.entrySet()) {
            System.out.println(entry.getKey().name + ": " + entry.getValue());
        }
    }

    private static void congratulate(Animal animal) {
        System.out.println("Winner: " + animal.name);
        System.out.print("Noise: ");
        animal.makeNoise();
        System.out.print("Custom: ");
        if (animal instanceof Antelope antelope) {
            antelope.jump();
        } else if (animal instanceof Horse horse) {
            horse.throwRider();
        }
        System.out.println();
    }
}
