package PointInRectangle;

public class Point {
    private int coordinatesX;
    private int coordinatesY;

    public Point(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    public boolean lessOrDrawTo(Point point) {
        return this.coordinatesX <= point.coordinatesX
                && this.coordinatesY <= point.coordinatesY;
    }

    public boolean moreOrDrawTo(Point point) {
        return this.coordinatesX >= point.coordinatesX
                && this.coordinatesY >= point.coordinatesY;
    }

}
