package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double price = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String season = input[2].toUpperCase();
        String discountType = input[3].toUpperCase();

        DiscountType discountType1 = DiscountType.valueOf(discountType);
        Season season1 = Season.valueOf(season);

        PriceCalculator priceCalculator = new PriceCalculator(price, days, discountType1, season1);
        double result = priceCalculator.calculate();
        System.out.println(String.format("%.2f", result));

    }
}
