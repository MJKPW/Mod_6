package com.kodilla.testing.shape;

public class Square implements  Shape{

    private double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return "Square";
    }

    public double getArea(){
        return Math.pow(this.sideLength, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square otherSquare = (Square) o;
        return this.sideLength == otherSquare.sideLength;
    }

    @Override
    public int hashCode() {
        return (int)this.sideLength;
    }
}
