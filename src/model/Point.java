
package model;

import java.util.Objects;

public class Point extends Object {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        if (other != null) {
            this.x = other.getX();
            this.y = other.getY();

        }
    }

    public boolean isAbove(Point other) {
        if (other == null) return false;
        return this.getY() > other.getY();
    }

    public boolean isUnder(Point other) {
        return !isAbove(other);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}


class Test {
    public static void main(String[] args) {
        // a -> x, y
        Point a = new Point(9.9, 7.7);
        Point b = new Point(9.9, 10.2);


        System.out.println(b.isAbove(a));

    }


}








