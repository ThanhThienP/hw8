package decorator;

public class Cheese extends ToppingDecorator {

    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getFoodDescription() {
        return foodItem.getFoodDescription() + " + Cheese";
    }

    @Override
    public double getFoodCost() {
        return foodItem.getFoodCost() + 1.39;
    }
}
