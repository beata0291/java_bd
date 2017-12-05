package ru.stqa.pft.sandbox;

public class TestPoint
        public static void main(String[] args) {
            Point p1 = new Point(2,2);
            Point p2 = new Point(4,4);

            System.out.println("Distance between them is " + distance(p1, p2));
}
