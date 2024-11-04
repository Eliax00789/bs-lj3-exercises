package n02_test_data_generator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();

        while_input:
        while (true) {
            System.out.print("Output as csv, json or xml (c, j, x): ");
            String input = System.console().readLine();
            switch (input.toLowerCase()) {
                case "csv", "c":
                    dataGenerator.setDataSetSaver(new DataSetSaverCSV());
                    break while_input;
                case "json", "j":
                    dataGenerator.setDataSetSaver(new DataSetSaverJSON());
                    break while_input;
                case "xml", "x":
                    dataGenerator.setDataSetSaver(new DataSetSaverXML());
                    break while_input;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

        System.out.print("Output filename: ");
        String input = System.console().readLine();
        File outputFile = new File(input);

        dataGenerator.createData(0, 10);
        dataGenerator.saveData(outputFile);
    }
}
