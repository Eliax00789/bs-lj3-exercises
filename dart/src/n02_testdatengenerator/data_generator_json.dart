part of 'data_generator.dart';

class DataGeneratorJSON extends DataGenerator {
  @override
  Future<void> saveData(final File file) async {
    await file.writeAsString(const JsonEncoder.withIndent('    ').convert(this._dataSet));
  }
}
