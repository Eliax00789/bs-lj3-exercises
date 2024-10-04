import 'dart:io';

import 'data_generator.dart';

class DataGeneratorXML extends DataGenerator {
  @override
  Future<void> saveData(final File file) async {
    final StringBuffer content = StringBuffer()
      ..write('<?xml version="1.0" encoding="UTF-8" standalone="no"?>')
      ..write(Platform.lineTerminator)
      ..write('<dataSet>')
      ..write(Platform.lineTerminator);
    for (final double dataPoint in this.dataSet) {
      content
        ..write('\t<dataPoint>')
        ..write(dataPoint)
        ..write('</dataPoint>')
        ..write(Platform.lineTerminator);
    }
    content
      ..write('</dataSet>')
      ..write(Platform.lineTerminator);
    await file.writeAsString(content.toString());
  }
}
