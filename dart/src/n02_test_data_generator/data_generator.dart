import 'dart:io';
import 'dart:math';

import 'package:meta/meta.dart';

import 'data_set_saver.dart';

class DataGenerator {
  @protected
  final List<double> dataSet = List.empty(growable: true);
  DataSetSaver? _saver;

  void createData(final double min, final double max) {
    final Random random = Random();
    for (int i = 0; i < 100; i++) {
      this.dataSet.add(random.nextDouble() * (max - min) + min);
    }
  }

  set saver(final DataSetSaver saver) => this._saver = saver;

  Future<void> saveData(final File file) => this._saver!.saveData(file, this.dataSet);
}
