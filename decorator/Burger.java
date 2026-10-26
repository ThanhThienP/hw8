package decorator;

public class Burger implements FoodItem {

    @Override
    public String getFoodDescription() {
        return "Burger";
    }

    @Override
    public double getFoodCost() {
        return 9.99;
    }
}
