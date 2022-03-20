package com.netcracker.geometry;

public class Circrle {
    private double radius = 1.0;
    private String color = "red";


    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circrle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Circrle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circrle() {
    }


}
