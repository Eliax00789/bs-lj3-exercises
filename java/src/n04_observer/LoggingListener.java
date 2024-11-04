package n04_observer;

import java.io.File;

public class LoggingListener implements EventListener {
    @Override
    public void update(File file) {
        System.out.println("Log for file: " + file.getAbsolutePath());
    }
}
