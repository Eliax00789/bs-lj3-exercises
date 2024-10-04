package n02_test_data_generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;

public class DataGeneratorCSV extends DataGenerator {
    @Override
    void saveData(File file) {
        StringJoiner content = new StringJoiner(",");
        for (Double dataPoint : this.dataSet) {
            content.add(dataPoint.toString());
        }
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
