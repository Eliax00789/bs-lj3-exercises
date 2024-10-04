import 'dart:io';

import 'data_generator.dart';

void main() async {
  DataGenerator dataGenerator;

  while_input:
  while (true) {
    stdout.write('Output as csv, json or xml (c, j, x): ');
    final String? input = stdin.readLineSync();
    switch (input) {
      case 'csv':
      case 'c':
        dataGenerator = DataGeneratorCSV();
        break while_input;
      case 'json':
      case 'j':
        dataGenerator = DataGeneratorJSON();
        break while_input;
      case 'xml':
      case 'x':
        dataGenerator = DataGeneratorXML();
        break while_input;
      default:
        print('Invalid input');
        break;
    }
  }

  stdout.write('Output filename: ');
  final String input = stdin.readLineSync() ?? '';
  final File outputFile = File(input);

  await (dataGenerator..createData(0, 10)).saveData(outputFile);
}
