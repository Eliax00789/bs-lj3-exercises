import 'dart:io';

import 'data_generator.dart';

class DataGeneratorCSV extends DataGenerator {
  @override
  Future<void> saveData(final File file) async {
    await file.writeAsString('${this.dataSet.join(',')}${Platform.lineTerminator}');
  }
}
