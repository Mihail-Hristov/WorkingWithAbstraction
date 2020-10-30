package JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = dimestions[0];
            int y = dimestions[1];

            Galaxy galaxy = new Galaxy(x, y);

            String command = scanner.nextLine();
            while (!command.equals("Let the Force be with you"))
            {
                Ivo ivo = new Ivo(Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray());
                Evil evil = new Evil(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray());

                evil.destroyStars(galaxy);
                ivo.collectStars(galaxy);

                command = scanner.nextLine();
            }

        System.out.println(Galaxy.sum);


    }
}
