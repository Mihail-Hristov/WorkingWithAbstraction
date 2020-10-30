package JediGalaxy;


public class Ivo {
    private static long sum;
    private Coordinates startCoordinate;

    public Ivo(int[] arr) {
        this.startCoordinate = new Coordinates(arr[0], arr[1]);
    }

    public void collectStars (Galaxy galaxy) {
        int x = this.startCoordinate.getX();
        int y = this.startCoordinate.getY();
        galaxy.collect(x, y);
    }
}
