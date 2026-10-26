package bridge;

public abstract class Payment {
    protected NotificationChannel channel;

    public Payment(NotificationChannel channel) {
        this.channel = channel;
    }

    public abstract void processPayment(double amount);
}
