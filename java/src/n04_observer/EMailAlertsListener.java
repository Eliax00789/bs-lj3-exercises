package n04_observer;

import java.io.File;

public class EMailAlertsListener implements EventListener {
    @Override
    public void update(File file) {
        System.out.println("Mail for file " + file.getAbsolutePath());
    }
}
