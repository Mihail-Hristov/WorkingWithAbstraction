package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double price = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String season = input[2];
        String discountType = input[3];

        Season season1 = new Season(season.toUpperCase());

        double finalPrice = PriceCalculator.priceCalculator(price, days, season1, discountType);

        System.out.println(String.format("%.2f", finalPrice));



    }
}
