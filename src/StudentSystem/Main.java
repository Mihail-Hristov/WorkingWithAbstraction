package StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String input = scanner.nextLine();
        while (!"Exit".equals(input)){
            String[] tokens = input.split("\\s+");
            studentSystem.doCommand(tokens);

            input = scanner.nextLine();
        }
    }
}
