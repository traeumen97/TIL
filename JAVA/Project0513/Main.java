package jungol; //616

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
            Scanner scanner = new Scanner(System.in);

            Point p1 = new Point(scanner.nextInt(), scanner.nextInt());
            Point p2 = new Point(scanner.nextInt(), scanner.nextInt());
            Point p3 = new Point(scanner.nextInt(), scanner.nextInt());

scanner.close();

            Triangle t = new Triangle(p1,p2,p3);
            System.out.println(t);
    }

}
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }



    public void setX(double x) {
        this.x = x;
    }



    public double getY() {
        return y;
    }



    public void setY(double y) {
        this.y = y;
    }



    public String toString() {
        return "(" + String.format("%.1f", x) + ", " + String.format("%.1f", y) + ")";
    }
}

class Triangle {
    private Point p1,p2,p3;
    private Point center;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        center = new Point((p1.getX() + p2.getX() + p3.getX())/3 , (p1.getY() + p2.getY() + p3.getY())/3);
    }

    @Override
    public String toString() {
        return center+"";
    }
}