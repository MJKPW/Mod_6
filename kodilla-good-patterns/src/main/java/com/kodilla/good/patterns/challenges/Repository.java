package com.kodilla.good.patterns.challenges;

import java.util.LinkedList;
import java.util.List;

public class Repository implements Verification{

    private final List<Data> items;

    public Repository(){
        items = new LinkedList<>();
    }

    public void add(Data item){
        items.add(item);
    }

    public void deleteItem(Data item){
        items.remove(item);
    }

    public boolean verify(Data item){
        return items.contains(item);
    }
}
