package JediGalaxy;

public class Evil {
    private Coordinates startCoordinate;

    public Evil(int[] arr) {
        this.startCoordinate = new Coordinates(arr[0], arr[1]);
    }

    public void destroyStars (Galaxy galaxy) {
        int x = this.startCoordinate.getX();
        int y = this.startCoordinate.getY();
        galaxy.setNull(x, y);
    }

}
