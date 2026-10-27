package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodItemTest {

    @Test
    public void testBurgerDescription() {
        FoodItem burger = new Burger();
        assertEquals("Burger", burger.getFoodDescription());
    }

    @Test
    public void testBurgerCost() {
        FoodItem burger = new Burger();
        assertEquals(9.99, burger.getFoodCost(), 0.01);
    }

    @Test
    public void testFrenchFriesDescription() {
        FoodItem fries = new FrenchFries();
        assertEquals("French Fries", fries.getFoodDescription());
    }

    @Test
    public void testFrenchFriesCost() {
        FoodItem fries = new FrenchFries();
        assertEquals(2.99, fries.getFoodCost(), 0.01);
    }

    @Test
    public void testHotDogDescription() {
        FoodItem hotDog = new HotDog();
        assertEquals("Hot Dog", hotDog.getFoodDescription());
    }

    @Test
    public void testHotDogCost() {
        FoodItem hotDog = new HotDog();
        assertEquals(3.99, hotDog.getFoodCost(), 0.01);
    }
}
