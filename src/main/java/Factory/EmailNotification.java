package Factory;

public class EmailNotification implements Notification{

    /*implementation for EmailNotification class*/
    @Override
    public String notifyUser() {

        return "EMAIL";
    }
}
