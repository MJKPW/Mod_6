package com.kodilla.good.patterns.challenges;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String warning){
        super(warning);
    }
}
