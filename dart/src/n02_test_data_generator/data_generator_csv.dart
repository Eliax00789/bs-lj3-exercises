part of 'data_generator.dart';

class DataGeneratorCSV extends DataGenerator {
  @override
  Future<void> saveData(final File file) async {
    await file.writeAsString('${this._dataSet.join(',')}${Platform.lineTerminator}');
  }
}
