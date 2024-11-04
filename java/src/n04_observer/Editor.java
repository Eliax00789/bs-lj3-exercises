package n04_observer;

import java.io.File;

public class Editor {
    public EventManager events;

    public Editor() {
        this.events = new EventManager();
    }

    public void openFile(File file) {
        this.events.notify(EventType.OPEN, file);
    }

    public void saveFile(File file) {
        this.events.notify(EventType.SAVE, file);
    }
}
