import 'dart:io';

import 'event_listener.dart';
import 'event_type.dart';

class EventManager {
    final Map<EventType, List<EventListener>> _listeners = {};

    void subscribe(final EventType eventType, final EventListener listener) {
        this._listeners.putIfAbsent(eventType, () => List.empty(growable: true));
        this._listeners[eventType]!.add(listener);
    }

    void unsubscribe(final EventType eventType, final EventListener listener) {
        this._listeners[eventType]!.remove(listener);
    }

    void notify(final EventType eventType, final File file) {
        if (this._listeners.containsKey(eventType)) {
            for (final EventListener listener in this._listeners[eventType]!) {
                listener.update(file);
            }
        }
    }
}
