import 'dart:io';

import 'event_listener.dart';

class LoggingListener with EventListener {
  @override
  void update(final File file) {
      print('Log for file: ${file.path}');
  }
}
