package n02_test_data_generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    protected List<Double> dataSet = new ArrayList<>();
    private DataSetSaver saver;

    public void createData(double min, double max) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            this.dataSet.add(random.nextDouble(min, max));
        }
    }

    public void setDataSetSaver(DataSetSaver saver) {
        this.saver = saver;
    }

    void saveData(File file) {
        this.saver.saveData(file, this.dataSet);
    }
}
