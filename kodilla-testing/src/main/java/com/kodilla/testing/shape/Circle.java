package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

public class Circle implements  Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle otherCircle = (Circle) o;
        return this.radius == otherCircle.radius;
    }

    @Override
    public int hashCode() {
        return (int)this.radius;
    }
}
