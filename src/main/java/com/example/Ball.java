package com.example;

public class Ball {
    private int x;
    private int y;
    private int radius;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return x + ", " + y + ", " + radius;
    }
}
