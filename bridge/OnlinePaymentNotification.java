package bridge;

public class OnlinePaymentNotification extends Payment {

    public OnlinePaymentNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing online payment $" + amount);
        channel.sendMessage("Online payment successful for $" + amount);
    }
}
