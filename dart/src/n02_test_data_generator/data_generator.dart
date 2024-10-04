import 'dart:io';
import 'dart:math';

import 'package:meta/meta.dart';

abstract class DataGenerator {
  @protected
  final List<double> dataSet = List.empty(growable: true);

  void createData(final double min, final double max) {
    final Random random = Random();
    for (int i = 0; i < 100; i++) {
      this.dataSet.add(random.nextDouble() * (max - min) + min);
    }
  }

  Future<void> saveData(final File file);
}
