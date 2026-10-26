package decorator;

public abstract class ToppingDecorator implements FoodItem {
    protected FoodItem foodItem; // the item being wrapped/decorated

    public ToppingDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
}
