package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    static class TestNotificationChannel implements NotificationChannel {
        String lastMessage;

        @Override
        public void sendMessage(String message) {
            this.lastMessage = message;
        }
    }

    @Test
    public void testCashOnDeliveryPayment() {
        TestNotificationChannel testChannel = new TestNotificationChannel();
        Payment payment = new CashOnDeliveryPayment(testChannel);

        payment.processPayment(60.25);

        assertEquals("Order placed! Amount of cash to pay on delivery: $60.25", testChannel.lastMessage,
                "CashOnDeliveryPayment should format the message correctly with the amount");
    }

    @Test
    public void testOnlinePaymentNotification() {
        TestNotificationChannel testChannel = new TestNotificationChannel();
        Payment payment = new OnlinePaymentNotification(testChannel);

        payment.processPayment(20.0);

        assertEquals("Online payment successful for $20.0", testChannel.lastMessage,
                "OnlinePaymentNotification should format the message correctly with the amount");
    }

    @Test
    public void testBitcoinPayment() {
        TestNotificationChannel testChannel = new TestNotificationChannel();
        Payment payment = new BitcoinPayment(testChannel);

        payment.processPayment(33.33);

        assertEquals("btc placed! $33.33", testChannel.lastMessage,
                "BitcoinPayment should format the message correctly with the amount");
    }

    @Test
    public void testBridgeInterchangeability() {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SmsChannel();
        NotificationChannel push = new PushChannel();

        Payment btcEmail = new BitcoinPayment(email);
        Payment cashSms = new CashOnDeliveryPayment(sms);
        Payment onlinePush = new OnlinePaymentNotification(push);

        assertDoesNotThrow(() -> btcEmail.processPayment(100.0));
        assertDoesNotThrow(() -> cashSms.processPayment(50.0));
        assertDoesNotThrow(() -> onlinePush.processPayment(25.0));
    }

    @Test
    public void testDriverMainExecution() {
        assertDoesNotThrow(() -> Driver.main(new String[] {}));
    }
}
