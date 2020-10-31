package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        int power = Card.valueOf(rank).getPower() + Suit.valueOf(suit).getPower();

        System.out.println(String.format("Card name: %s of %s; Card power: %d",
                Card.valueOf(rank), Suit.valueOf(suit), power));
    }
}
