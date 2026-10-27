package decorator;

public class Ketchup extends ToppingDecorator {

    public Ketchup(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getFoodDescription() {
        return foodItem.getFoodDescription() + " + Ketchup";
    }

    @Override
    public double getFoodCost() {
        return foodItem.getFoodCost() + 0.20;
    }
}
