// Legacy pricing system (incompatible with our current Pricing interface)
class LegacyPricing {
    public double makePayment(double basePrice) {
        // some logic here applying conditions to calculate final price
        System.out.println("Calculating price by Legacy Pricing System.");
        return basePrice * 1.3;
    }
}

// Adapter to integrate LegacyPricing with PricingStrategy interface
class PricingAdapter implements PricingStrategy {
    private LegacyPricing legacyPayment;

    public PricingAdapter(LegacyPricing legacyPayment) {
        this.legacyPayment = legacyPayment;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return legacyPayment.makePayment(basePrice);  // Delegate call to legacy system
    }
}