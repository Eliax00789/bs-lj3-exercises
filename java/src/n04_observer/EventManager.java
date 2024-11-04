package n04_observer;

import java.io.File;
import java.util.*;

public class EventManager {
    private Map<EventType, List<EventListener>> listeners;

    public EventManager() {
        this.listeners = new HashMap<>();
    }

    public void subscribe(EventType eventType, EventListener listener) {
        this.listeners.putIfAbsent(eventType, new ArrayList<>());
        this.listeners.get(eventType).add(listener);
    }

    public void unsubscribe(EventType eventType, EventListener listener) {
        this.listeners.get(eventType).remove(listener);
    }

    public void notify(EventType eventType, File file) {
        if (this.listeners.containsKey(eventType)) {
            for (EventListener listener : this.listeners.get(eventType)) {
                listener.update(file);
            }
        }
    }
}
