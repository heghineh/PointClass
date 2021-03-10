package com.company;

public class Main {

    public static void main(String[] args) {

	Point point = new Point(3,4);
	Point point1 = new Point(3,4);

        System.out.println("Distance from the 0" + point.distance());
        System.out.println(point.distance(point1));
    }
}
