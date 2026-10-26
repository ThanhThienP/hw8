package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class NotificationChannelTest {

    @Test
    public void testEmailChannelSendMessage() {
        NotificationChannel email = new EmailChannel();
        assertDoesNotThrow(() -> email.sendMessage("Testing email channel"));
    }

    @Test
    public void testSmsChannelSendMessage() {
        NotificationChannel sms = new SmsChannel();
        assertDoesNotThrow(() -> sms.sendMessage("Testing SMS channel"));
    }

    @Test
    public void testPushChannelSendMessage() {
        NotificationChannel push = new PushChannel();
        assertDoesNotThrow(() -> push.sendMessage("Testing push channel"));
    }
}
