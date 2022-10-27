package ch16point;

public class PointTest {
    public static void main(String[] args) {

        Point point = new Point(4, 5);
        Point point2 = new Point();
        Point point3 = new Point(1, 2);

        System.out.println(point.distanceToOrigin());
        System.out.println(point2.distanceToOrigin());

        System.out.println(point.distanceBetweenTwoPoint(0, 0));
        System.out.println(point.distanceBetweenTwoPoint(point3));

        System.out.println(point.getX());
        System.out.println(point.getY());
        point.move(6, -8);
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
