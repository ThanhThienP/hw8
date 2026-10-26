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

        System.err.println();

        Payment onlineSms = new OnlinePaymentNotification(sms);
        onlineSms.processPayment(20);
        Payment onlineEmail = new OnlinePaymentNotification(email);
        onlineEmail.processPayment(17.99);
    }
}
