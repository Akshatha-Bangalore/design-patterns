package Factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void factoryTestForSMS(){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        Assertions.assertEquals("SMS", notification.notifyUser());
    }

    @Test
    public void factoryTestForEMAIL(){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        Assertions.assertEquals("EMAIL", notification.notifyUser());
    }

    @Test
    public void factoryTestForPUSH(){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("PUSH");
        Assertions.assertEquals("PUSH", notification.notifyUser());
    }
}
