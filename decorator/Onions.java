package decorator;

public class Onions extends ToppingDecorator {

    public Onions(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getFoodDescription() {
        return foodItem.getFoodDescription() + " + Onions";
    }

    @Override
    public double getFoodCost() {
        return foodItem.getFoodCost() + 0.65;
    }
}
