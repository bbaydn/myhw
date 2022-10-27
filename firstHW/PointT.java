package Point;

public class PointTest{

    public static void main(String[] args){
        Point p1 = new Point(28, 34);    
        Point p2 = new Point(45, 34);  

        double result = point.distanceFromTheOrigin();
        System.out.println(result);

        double result2 = point.distanceFromAnotherPoint(p2);
        System.out.println(result2);

    }
}