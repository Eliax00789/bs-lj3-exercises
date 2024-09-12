package n02_testdatengenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class DataGenerator {
    protected List<Double> dataSet = new ArrayList<>();

    public void createData(double min, double max) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            this.dataSet.add(random.nextDouble(min, max));
        }
    }

    abstract void saveData(File file);
}
