package ru.stqa.pft.sandbox;

public class TestPoint{
    public static double distance(Point p1, Point p2){
    double dx = p2.x - p1.x;
    double dy = p2.y - p2.y;
    return Math.sqrt(dx * dx + dy * dy);}

        public static void main(String[] args) {
            Point p1 = new Point(2,2);
            Point p2 = new Point(4,4);

            System.out.println("Distance between them is " + distance(p1, p2));
        }
}

