package com.kodilla.good.patterns.challenges;

import java.util.LinkedList;
import java.util.List;

public class Users implements Verification{

    private final List<Data> users;

    public Users(){
        users = new LinkedList<>();
    }

    public void add(Data user){
        users.add(user);
    }

    public void deleteAccount(Data user){
        users.remove(user);
    }

    public boolean verify(Data user){
        return users.contains(user);
    }
}
