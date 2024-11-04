import 'dart:convert';
import 'dart:io';

import 'data_set_saver.dart';

class DataSetSaverJSON with DataSetSaver {
  @override
  Future<void> saveData(final File file, final List<double> dataSet) async {
    await file.writeAsString(const JsonEncoder.withIndent('    ').convert(dataSet));
  }
}
