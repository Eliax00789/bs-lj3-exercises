import 'dart:io';

import 'event_manager.dart';
import 'event_type.dart';

class Editor {
    EventManager events = EventManager();

    void openFile(final File file) {
        this.events.notify(EventType.open, file);
    }

    void saveFile(final File file) {
        this.events.notify(EventType.save, file);
    }
}
