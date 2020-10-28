import java.util.Scanner;

public class Main {


    public static class Rhombus {
        private int size;

        public Rhombus(int size) {
            this.size = size;
        }

        public void printRhombus() {
            printTopHalf();
            printBottomHalf();
        }

        private void printBottomHalf() {
            for (int i = 1; i < this.size; i++) {
                printRow(i, " ");
            }
        }

        private void printTopHalf() {
            for (int i = 1; i <= this.size; i++) {
                printRow(this.size - i, " ");
            }

        }

        private void printRow(int count, String symbol) {
            for (int i = 0; i < count; i++) {
                System.out.print(symbol);
            }
            for (int i = 0; i < this.size - count; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rhombusSize = Integer.parseInt(scanner.nextLine());

        Rhombus rhombus = new Rhombus(rhombusSize);

        rhombus.printRhombus();

    }
}
