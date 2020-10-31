package CarSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(input + ":");
        for (Suits suits : Suits.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", suits.ordinal(), suits.name()));
        }
    }
}
