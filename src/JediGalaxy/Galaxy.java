package JediGalaxy;

public class Galaxy {
    private int rows;
    private int cols;
    private int[][] galaxy;
    public static long sum;

    public Galaxy(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        createGalaxy(rows, cols);
        }

        private void createGalaxy(int rows, int cols) {
        this.galaxy = new int[rows][cols];
        int count = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                this.galaxy[row][col] = count++;
            }
        }
    }

    public void setNull(int x, int y) {
        while (x >= 0 && y >= 0)
        {
            if (x >= 0 && x < galaxy.length && y >= 0 && y < galaxy[0].length)
            {
                galaxy[x] [y] = 0;
            }
            x--;
            y--;
        }
    }

    public void collect(int x, int y) {
        while (x >= 0 && y < galaxy[1].length)
        {
            if (x >= 0 && x < galaxy.length && y >= 0 && y < galaxy[0].length)
            {
                sum += galaxy[x][y];
            }

            y++;
            x--;
        }
    }

}
