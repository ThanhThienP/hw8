package decorator;

public class HotDog implements FoodItem {

    @Override
    public String getFoodDescription() {
        return "Hot Dog";
    }

    @Override
    public double getFoodCost() {
        return 3.99;
    }
}
