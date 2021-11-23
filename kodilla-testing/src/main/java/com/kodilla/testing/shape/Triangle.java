package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double sideLength;
    private double height;

    public Triangle(double sideLength, double height){
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    public double getArea(){
        return 0.5 * this.sideLength * this.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle otherTriangle = (Triangle) o;
        return (this.sideLength == otherTriangle.sideLength) &&
                        (this.height == otherTriangle.height) ;
    }

    @Override
    public int hashCode() {
        return (int)this.sideLength +  (int)this.height;
    }
}
