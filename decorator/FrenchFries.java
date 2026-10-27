package decorator;

public class FrenchFries implements FoodItem {

    @Override
    public String getFoodDescription() {
        return "French Fries";
    }

    @Override
    public double getFoodCost() {
        return 2.99;
    }
}
