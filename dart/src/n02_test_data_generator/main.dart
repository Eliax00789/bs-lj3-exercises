import 'dart:io';

import 'data_generator.dart';
import 'data_set_saver_csv.dart';
import 'data_set_saver_json.dart';
import 'data_set_saver_xml.dart';

void main() async {
  final DataGenerator dataGenerator = DataGenerator();

  while_input:
  while (true) {
    stdout.write('Output as csv, json or xml (c, j, x): ');
    final String? input = stdin.readLineSync();
    switch (input) {
      case 'csv':
      case 'c':
        dataGenerator.saver = DataSetSaverCSV();
        break while_input;
      case 'json':
      case 'j':
        dataGenerator.saver = DataSetSaverJSON();
        break while_input;
      case 'xml':
      case 'x':
        dataGenerator.saver = DataSetSaverXML();
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
