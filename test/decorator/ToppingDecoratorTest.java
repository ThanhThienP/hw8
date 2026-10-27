package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToppingDecoratorTest {

    @Test
    public void testCheeseOnBurger() {
        FoodItem item = new Cheese(new Burger());
        assertEquals("Burger + Cheese", item.getFoodDescription());
        assertEquals(9.99 + 1.39, item.getFoodCost(), 0.01);
    }

    @Test
    public void testKetchupOnHotDog() {
        FoodItem item = new Ketchup(new HotDog());
        assertEquals("Hot Dog + Ketchup", item.getFoodDescription());
        assertEquals(3.99 + 0.20, item.getFoodCost(), 0.01);
    }

    @Test
    public void testOnionsOnFrenchFries() {
        FoodItem item = new Onions(new FrenchFries());
        assertEquals("French Fries + Onions", item.getFoodDescription());
        assertEquals(2.99 + 0.65, item.getFoodCost(), 0.01);
    }

    @Test
    public void testStackedToppings() {
        FoodItem item = new Onions(new Ketchup(new Cheese(new Burger())));
        assertEquals("Burger + Cheese + Ketchup + Onions", item.getFoodDescription());
        assertEquals(9.99 + 1.39 + 0.20 + 0.65, item.getFoodCost(), 0.01);
    }

    @Test
    public void testDoubleCheese() {
        FoodItem item = new Cheese(new Cheese(new Burger()));
        assertEquals("Burger + Cheese + Cheese", item.getFoodDescription());
        assertEquals(9.99 + 1.39 + 1.39, item.getFoodCost(), 0.01);
    }
}
