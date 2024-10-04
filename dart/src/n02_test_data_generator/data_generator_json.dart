import 'dart:convert';
import 'dart:io';

import 'data_generator.dart';

class DataGeneratorJSON extends DataGenerator {
  @override
  Future<void> saveData(final File file) async {
    await file.writeAsString(const JsonEncoder.withIndent('    ').convert(this.dataSet));
  }
}
