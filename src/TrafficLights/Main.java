package TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int numberOfTimes = Integer.parseInt(scanner.nextLine());

        TrafficLight trafficLight = new TrafficLight(tokens);

        for (int i = 0; i < numberOfTimes; i++) {
            trafficLight.update();
            System.out.println(trafficLight);
        }
    }
}
