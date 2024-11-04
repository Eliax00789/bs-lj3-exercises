import 'dart:io';

import 'data_set_saver.dart';

class DataSetSaverCSV with DataSetSaver {
  @override
  Future<void> saveData(final File file, final List<double> dataSet) async {
    await file.writeAsString('${dataSet.join(',')}${Platform.lineTerminator}');
  }
}
