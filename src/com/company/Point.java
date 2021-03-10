package com.company;

public class Point {

//region Properties
    private int coordinateX;
    private int coordinateY;
//endregion

//region Constructors
    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
//endregion

//region Public Methods
    public double distance() {
        return Math.sqrt((Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2)));
    }

    public double distance(Point point) {
        return Math.sqrt((Math.pow(coordinateX - point.coordinateX, 2)
                + Math.pow(coordinateY - point.coordinateY, 2)));
    }
//endregion

//region Getters and Setters
    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
//endregion
}