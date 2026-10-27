package decorator;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ FoodItemTest.class, ToppingDecoratorTest.class, OrderTest.class, LoyaltyDiscountTest.class })
public class CompleteUnitTest {

}
