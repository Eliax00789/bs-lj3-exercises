package n02_testdatengenerator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        DataGenerator dataGeneratorCSV = new DataGeneratorCSV();
        dataGeneratorCSV.createData(0, 10);
        dataGeneratorCSV.saveData(new File("dataset.csv"));

        DataGenerator dataGeneratorJSON = new DataGeneratorJSON();
        dataGeneratorJSON.createData(0, 10);
        dataGeneratorJSON.saveData(new File("dataset.json"));

        DataGenerator dataGeneratorXML = new DataGeneratorXML();
        dataGeneratorXML.createData(0, 10);
        dataGeneratorXML.saveData(new File("dataset.xml"));
    }
}
