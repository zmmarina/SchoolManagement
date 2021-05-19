package services;

public class Year2021 implements Discount {
    private static final double DISCOUNT_TAX = 0.02;

    @Override
    public Double loyaltyDiscount(double amount, int months) {
        return amount * months * DISCOUNT_TAX;
    }
}
