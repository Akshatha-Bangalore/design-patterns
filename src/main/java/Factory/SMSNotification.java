package Factory;

public class SMSNotification implements Notification{

    /*implementation for SMSNotification class*/
    @Override
    public String notifyUser() {
        return  "SMS";

    }
}
