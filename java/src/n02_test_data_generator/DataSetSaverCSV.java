package n02_test_data_generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.StringJoiner;

public class DataSetSaverCSV implements DataSetSaver {
    @Override
    public void saveData(File file, List<Double> dataSet) {
        StringJoiner content = new StringJoiner(",");
        for (Double dataPoint : dataSet) {
            content.add(dataPoint.toString());
        }
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
