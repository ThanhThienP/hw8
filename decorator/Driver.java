package decorator;

public class Driver {
    public static void main(String[] args) {

        FoodItem burger = new Burger();
        System.out.println(burger.getFoodDescription() + " $" + burger.getFoodCost());

        FoodItem cheeseBurger = new Cheese(new Burger());
        System.out.println(cheeseBurger.getFoodDescription() + " $" + cheeseBurger.getFoodCost());
    }
}
