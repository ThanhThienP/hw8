package decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getFoodCost();
        }
        return total;
    }

    public void printSummary() {
        System.out.println("Order Summary:");
        for (FoodItem item : items) {
            System.out.printf("%-35s $%.2f%n", item.getFoodDescription(), item.getFoodCost());
        }
        System.out.printf("%-35s $%.2f%n", "Total", getTotalCost());
    }
}
