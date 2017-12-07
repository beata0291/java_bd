package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;

public Point(double x, double y){
        this.x = x;
        this.y = y;
        }

    public static double distance(Point p1, Point p2){
        double dx = p2.x - p1.x;
        double dy = p2.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

        public double distance(Point p2) {
            double dx = this.x - p2.x;
            double dy = this.y - p2.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

public double getX(){
        return x;
        }

public double getY(){
        return y;
        }

}

