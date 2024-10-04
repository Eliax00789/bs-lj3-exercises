package n02_test_data_generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataGeneratorJSON extends DataGenerator {
    @Override
    void saveData(File file) {
        StringBuilder content = new StringBuilder();
        content.append("[").append(System.lineSeparator());
        if (!this.dataSet.isEmpty()) {
            for (Double dataPoint : this.dataSet) {
                content.append("    ").append(dataPoint).append(',').append(System.lineSeparator());
            }
            content.deleteCharAt(content.length() - 2);
        }
        content.append("]").append(System.lineSeparator());
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
