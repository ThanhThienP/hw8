package bridge;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ NotificationChannelTest.class, PaymentTest.class })
public class CompleteUnitTest {

}
