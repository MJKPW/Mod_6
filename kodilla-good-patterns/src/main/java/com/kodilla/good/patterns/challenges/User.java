package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class User implements Data{

    private double balance;
    private String password;
    private final String login;

    public User(double balance, String login, String password){
        this.login = login;
        this.password = password;
        this.balance = balance;
    }

    public void makePayment(Item item){
        if(item.getPrice() > balance){
            throw new InsufficientFundsException("Not enough funds");
        }else{
            balance -= item.getPrice();
        }
    }

    public void changePassword(String newPassword){
        password = newPassword;
    }

    @Override
    public boolean checkIfAvailable(Verification verification){
        return verification.verify(this);
    }

    public double getBalance(){
        return balance;
    }

    public String getLogin(){
        return login;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.balance, balance) == 0 &&
                Objects.equals(password, user.password) && Objects.equals(login, user.login);
    }

}
