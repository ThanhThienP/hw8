package bridge;

public class CashOnDeliveryPayment extends Payment {

    public CashOnDeliveryPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
        channel.sendMessage("Order placed! Amount of cash to pay on delivery: $" + amount);
    }
}
