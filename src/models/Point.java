package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    // Getters methods that make a field Readable!
    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    // Setters method that make a field Writeable!
    /*public void setX(double x){
        this.x = x;
    }
                                       didnt use setters because there are already coordinates in source
    public void setY(double y){
        this.y = y;
    }*/

    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest){
        double dx = this.x - dest.getX();
        double dy = this.y - dest.getY();
        return  Math.sqrt(dx * dx + dy * dy);
    }

    // toString Override
    @Override
    public String toString(){
        return x + " " + y;
    }
}