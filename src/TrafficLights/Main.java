package TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int numberOfTimes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfTimes; i++) {
            for (int j = 0; j < tokens.size(); j++) {
                tokens.set(j, TrafficLight.valueOf(tokens.get(j)).getNextColor());
            }
            System.out.println(String.join(" ", tokens));
        }
    }
}
