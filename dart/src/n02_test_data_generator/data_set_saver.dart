import 'dart:io';

mixin DataSetSaver {
  Future<void> saveData(final File file, final List<double> dataSet);
}
