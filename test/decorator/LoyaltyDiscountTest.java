package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoyaltyDiscountTest {

    @Test
    public void testSignatureDiscount() {
        LoyaltyDiscount signature = new LoyaltyDiscount("Signature");
        double result = signature.applyDiscount(100.0);
        assertEquals(75.0, result, 0.01);
    }

    @Test
    public void testSilverDiscount() {
        LoyaltyDiscount silver = new LoyaltyDiscount("Silver");
        double result = silver.applyDiscount(100.0);
        assertEquals(87.0, result, 0.01);
    }

    @Test
    public void testRegularNoDiscount() {
        LoyaltyDiscount regular = new LoyaltyDiscount("Regular");
        double result = regular.applyDiscount(100.0);
        assertEquals(100.0, result, 0.01);
    }

    @Test
    public void testSignatureDiscountWithOrderTotal() {
        Order order = new Order();
        order.addItem(new Onions(new Ketchup(new Cheese(new Burger()))));
        order.addItem(new FrenchFries());

        LoyaltyDiscount signature = new LoyaltyDiscount("Signature");
        double discounted = signature.applyDiscount(order.getTotalCost());
        assertEquals(order.getTotalCost() * 0.75, discounted, 0.01);
    }
}
