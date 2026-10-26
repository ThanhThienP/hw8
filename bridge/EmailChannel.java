package bridge;

public class EmailChannel implements NotificationChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("[Email] " + message);
    }
}
