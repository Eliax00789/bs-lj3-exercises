import 'dart:io';

import 'data_generator.dart';

void main() async {
  await (DataGeneratorCSV()..createData(0, 10)).saveData(File('dataset.csv'));
  await (DataGeneratorJSON()..createData(0, 10)).saveData(File('dataset.json'));
  await (DataGeneratorXML()..createData(0, 10)).saveData(File('dataset.xml'));
}
