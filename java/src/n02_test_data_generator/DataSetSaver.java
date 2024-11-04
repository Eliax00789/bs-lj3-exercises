package n02_test_data_generator;

import java.io.File;
import java.util.List;

public interface DataSetSaver {
    void saveData(File file, List<Double> dataSet);
}
