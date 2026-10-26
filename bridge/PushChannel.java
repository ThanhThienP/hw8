package bridge;

public class PushChannel implements NotificationChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("[PushChannel] " + message);
    }
}
