import 'dart:convert';
import 'dart:io';
import 'dart:math';

part 'data_generator_csv.dart';
part 'data_generator_json.dart';
part 'data_generator_xml.dart';

abstract class DataGenerator {
  final List<double> _dataSet = List.empty(growable: true);

  void createData(final double min, final double max) {
    final Random random = Random();
    for (int i = 0; i < 100; i++) {
      this._dataSet.add(random.nextDouble() * (max - min) + min);
    }
  }

  Future<void> saveData(final File file);
}
