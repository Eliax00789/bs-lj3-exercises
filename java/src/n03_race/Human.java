package n03_race;

import java.util.Random;

public class Human extends Animal {
    public final String name;
    public final int age;

    public Human(String name, int age) {
        super("Human", 2, 25, 10);
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("talk");
    }
}
