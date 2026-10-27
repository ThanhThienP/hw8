package decorator;

public class Driver {
    public static void main(String[] args) {

        FoodItem burger = new Burger();
        System.out.println(burger.getFoodDescription() + " $" + burger.getFoodCost());

        FoodItem cheeseBurger = new Cheese(new Burger());
        System.out.println(cheeseBurger.getFoodDescription() + " $" + cheeseBurger.getFoodCost());

        FoodItem onionFries = new Onions(new FrenchFries());
        System.out.println(onionFries.getFoodDescription() + " $" + onionFries.getFoodCost());

        FoodItem hotDogWithKetchup = new Ketchup(new HotDog());
        System.out.println(hotDogWithKetchup.getFoodDescription() + " $" + hotDogWithKetchup.getFoodCost());

        System.out.println();

        Order order = new Order();
        order.addItem(cheeseBurger);
        order.addItem(onionFries);
        order.addItem(hotDogWithKetchup);
        order.addItem(new FrenchFries());
        order.printSummary();

        System.out.println();

        LoyaltyDiscount signature = new LoyaltyDiscount("Signature");
        signature.applyDiscount(order.getTotalCost());
    }
}
