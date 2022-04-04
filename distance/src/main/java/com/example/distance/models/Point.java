package com.example.distance.models;

public class Point {
    public double x;
    public double y;

    public static double distanceBetweenPoints(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x,2)+Math.pow(p1.y- p2.y,2));
    }
}
