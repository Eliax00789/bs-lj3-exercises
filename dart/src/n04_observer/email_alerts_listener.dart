import 'dart:io';

import 'event_listener.dart';

class EMailAlertsListener with EventListener {
  @override
  void update(final File file) {
      print('Mail for file: ${file.path}');
  }
}
