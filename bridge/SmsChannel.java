package bridge;

public class SmsChannel implements NotificationChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("[SMS] " + message);
    }
}
