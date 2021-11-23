package com.kodilla.testing.shape;

import java.util.List;
import java.util.ArrayList;

public class ShapeCollector {

    private List<Shape> collection;

    public ShapeCollector(){
        collection = new ArrayList<>();
    }

    public void addFigure(Shape shape){
        collection.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (collection.contains(shape)) {
            collection.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        if(n < 0 || n >= this.collection.size())
            return null;
        return this.collection.get(n);
    }

    public String showFigures(){
        StringBuilder result = new StringBuilder();
        for(int i=0;i!=this.collection.size();++i){
            result.append(this.collection.get(i).getName());
            if(i != this.collection.size() - 1)
                result.append(", ");
        }
        return result.toString();
    }

    public int getLength(){
        return collection.size();
    }
}
