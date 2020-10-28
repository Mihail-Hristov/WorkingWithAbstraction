package HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discountType;


    public static double priceCalculator(double pricePerDay, int days, String season, DiscountType discountType) {
        double basicPrice = pricePerDay * days;
        int multiply = season.toUpperCase().getValue();
        double priceBeforeDiscount = basicPrice * multiply;
        double discount = discountType.getDiscount() / 100.0;
        double discountedAmount = priceBeforeDiscount * discount;

        return priceBeforeDiscount - discountedAmount;
    }


}
