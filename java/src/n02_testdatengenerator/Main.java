package n02_testdatengenerator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        DataGenerator dataGenerator;

        while_input:
        while (true) {
            System.out.print("Output as csv, json or xml (c, j, x): ");
            String input = System.console().readLine();
            switch (input.toLowerCase()) {
                case "csv", "c":
                    dataGenerator = new DataGeneratorCSV();
                    break while_input;
                case "json", "j":
                    dataGenerator = new DataGeneratorJSON();
                    break while_input;
                case "xml", "x":
                    dataGenerator = new DataGeneratorXML();
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
