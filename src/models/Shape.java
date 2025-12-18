package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> list = new ArrayList<>();

    // addPoint(Point) - adds to the container
    public void addPoint(Point p){
        points.add(p);
    }

    // calculatePerimeter()
    public void calculatePerimetr(){
        double perimetr = 0;

        for(int i = 0 ; i < list.size() ; i++){

        }
    }

    // getAverageSide()
    public void getAverageSide(double x , double y){
        return calculatePerimetr()/list.size();
    }

    // getLongestSide()
    public void getLongestSide(double x , double y){
        double max = 0;

        for(int i = 0; i< list.size() ; i++){

        }
    }
}