class Booking {
    private PricingStrategy pricingStrategy;
    private double basePrice;
  
    public Booking(double basePrice) {
        this.basePrice = basePrice;
    }
  
     public void setPricingStrategy(PricingStrategy pricingStrategy) {
         this.pricingStrategy = pricingStrategy;
     }
  
    public double applyPricing() {
        return pricingStrategy.calculatePrice(basePrice);
    }
  }