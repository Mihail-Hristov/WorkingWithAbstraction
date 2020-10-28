package PointInRectangle;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);

        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);

        Point bottomLeft = new Point(x1, y1);
        Point topRight = new Point(x2, y2);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int numberOfLine = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLine; i++) {
            List<Integer> tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList());
            Point currentPoint = new Point(tokens.get(0), tokens.get(1));

            System.out.println(rectangle.contains(currentPoint));
        }

    }
}
