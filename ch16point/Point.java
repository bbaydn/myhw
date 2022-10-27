package ch16point;

public class Point {

    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceToOrigin(int x, int y) {
        return this.distanceBetweenTwoPoint(this.x, this.y);
    }

    public double distanceBetweenTwoPoint(Point point) {
        return this.distanceBetweenTwoPoint(point.getX(), point.getY());
    }

    public double distanceBetweenTwoPoint(int x, int y) {
        return sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public Point clone(Point point) {
        return new Point(point.getX(), point.getY());
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

}
