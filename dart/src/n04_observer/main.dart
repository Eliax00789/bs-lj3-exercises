import 'dart:io';

import 'editor.dart';
import 'email_alerts_listener.dart';
import 'event_type.dart';
import 'logging_listener.dart';

void main() {
    final Editor editor = Editor();
    editor.events
        ..subscribe(EventType.open, LoggingListener())
        ..subscribe(EventType.save, LoggingListener())
        ..subscribe(EventType.save, EMailAlertsListener());

    final File file = File(Platform.script.toFilePath());
    editor
        ..openFile(file)
        ..saveFile(file);
}
