package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testEmptyOrder() {
        Order order = new Order();
        assertEquals(0.0, order.getTotalCost(), 0.01);
    }

    @Test
    public void testSingleItemOrder() {
        Order order = new Order();
        order.addItem(new Burger());
        assertEquals(9.99, order.getTotalCost(), 0.01);
    }

    @Test
    public void testMultipleItemsOrder() {
        Order order = new Order();
        order.addItem(new Burger());
        order.addItem(new FrenchFries());
        order.addItem(new HotDog());
        assertEquals(9.99 + 2.99 + 3.99, order.getTotalCost(), 0.01);
    }

    @Test
    public void testOrderWithToppings() {
        Order order = new Order();
        order.addItem(new Cheese(new Burger()));
        order.addItem(new Ketchup(new FrenchFries()));
        assertEquals((9.99 + 1.39) + (2.99 + 0.20), order.getTotalCost(), 0.01);
    }

    @Test
    public void testPrintSummaryDoesNotThrow() {
        Order order = new Order();
        order.addItem(new Burger());
        order.addItem(new Cheese(new FrenchFries()));
        assertDoesNotThrow(() -> order.printSummary());
    }
}
