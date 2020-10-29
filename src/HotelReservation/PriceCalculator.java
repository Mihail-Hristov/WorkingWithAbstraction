package HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int days, DiscountType discountType, Season season) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculate() {
        return this.days * this.pricePerDay * (1 - this.discountType.getDiscount() / 100.0) * this.season.getValue();
    }


}
