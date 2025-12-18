package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> points = new ArrayList<>();

    // addPoint(Point) - adds to the container
    public void addPoint(Point p){
        points.add(p);
    }

    // calculatePerimeter()
    public double calculatePerimeter(){
        if(points.size() < 2)return 0;

        double perimeter = 0;

        for(int i = 0 ; i < points.size() ; i++){
            Point current = points.get(i);
            Point next = points.get((i+1) % points.size());
            perimeter += current.distance(next);
        }
        return perimeter;
    }

    // getAverageSide()
    public double getAverageSide(){
        if(points.size() < 2)return 0;
        return calculatePerimeter()/points.size();
    }

    // getLongestSide()
    public double getLongestSide(){
        if(points.size() < 2)return 0;

        double max = 0;

        for(int i = 0; i< points.size() ; i++){
            Point current = points.get(i);
            Point next = points.get((i+1) % points.size());
            double dist = current.distance(next);

            if (dist > max){
                max = dist;
            }
        }
        return max;
    }
}