package decorator;

public class LoyaltyDiscount {
    private String loyaltyLevel;

    public LoyaltyDiscount(String loyaltyLevel) {
        this.loyaltyLevel = loyaltyLevel;
    }

    public double applyDiscount(double totalCost) {
        double discount;

        switch (loyaltyLevel.toLowerCase()) {
            case "signature":
                discount = 0.25;
                break;
            case "silver":
                discount = 0.13;
                break;
            default:
                discount = 0.0;
                break;
        }

        double discountedTotal = totalCost * (1 - discount);
        System.out.printf("Loyalty Status: %s || Discount: %.0f%% || Final Price: $%.2f%n",
                loyaltyLevel, discount * 100, discountedTotal);
        return discountedTotal;
    }
}
