package n04_observer;

import java.io.File;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        Editor editor = new Editor();
        editor.events.subscribe(EventType.OPEN, new LoggingListener());
        editor.events.subscribe(EventType.SAVE, new LoggingListener());
        editor.events.subscribe(EventType.SAVE, new EMailAlertsListener());

        File file = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI());
        editor.openFile(file);
        editor.saveFile(file);
    }
}
