package bridge;

public class Driver {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SmsChannel();

        // Testing cash payment, then send to SMS or Email
        Payment cashSms = new CashOnDeliveryPayment(sms);
        cashSms.processPayment(60.25);

        Payment cashEmail = new CashOnDeliveryPayment(email);
        cashEmail.processPayment(67.26);

        System.out.println();

        Payment onlineSms = new OnlinePaymentNotification(sms);
        onlineSms.processPayment(20);
        Payment onlineEmail = new OnlinePaymentNotification(email);
        onlineEmail.processPayment(17.99);

        System.out.println();

        Payment btcSms = new BitcoinPayment(sms);
        btcSms.processPayment(33.33);
        Payment btcEmail = new BitcoinPayment(email);
        btcEmail.processPayment(66.66);
    }
}
