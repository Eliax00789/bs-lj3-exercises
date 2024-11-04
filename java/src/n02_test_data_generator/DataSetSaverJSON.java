package n02_test_data_generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataSetSaverJSON implements DataSetSaver {
    @Override
    public void saveData(File file, List<Double> dataSet) {
        StringBuilder content = new StringBuilder();
        content.append("[").append(System.lineSeparator());
        if (!dataSet.isEmpty()) {
            for (Double dataPoint : dataSet) {
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
