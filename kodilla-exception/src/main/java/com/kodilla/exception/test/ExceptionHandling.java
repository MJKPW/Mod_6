package com.kodilla.exception.test;

public class ExceptionHandling {
    public void handling(double x, double y) throws IllegalArgumentException{
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x, y));
        } catch(Exception e) {
            throw new IllegalArgumentException("Arguments failed to meet required criteria");
        } finally {
            System.out.println("Finished");
        }
    }
}
