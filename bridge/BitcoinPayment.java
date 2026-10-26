package bridge;

public class BitcoinPayment extends Payment {

    public BitcoinPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing btc payment of $" + amount);
        channel.sendMessage("btc placed! $" + amount);
    }

}
