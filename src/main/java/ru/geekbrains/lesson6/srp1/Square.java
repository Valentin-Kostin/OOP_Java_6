package ru.geekbrains.lesson6.srp1;

import java.util.ArrayList;
import java.util.List;

public class Square {

    private List<Point> points;

    private int side;
    private int scale;

    public Square(Point point1, int side) {
        this.side = side;

        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY() + side);

        points = new ArrayList<>(4);
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

    }

    public int getSide() {
        return side;
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getArea(){
        return side * side;
    }



}
