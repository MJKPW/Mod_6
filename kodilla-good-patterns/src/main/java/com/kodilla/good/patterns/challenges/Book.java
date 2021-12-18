package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Book implements Data, Item{

    private int count;
    private final double price;
    private final String title;
    private final boolean hardCover;

    public Book(int count, double price, String name, boolean hardCover){
        if(count < 0)
            throw new IllegalArgumentException("Negative book count");
        if(price < 0)
            throw new IllegalArgumentException("Negative price");
        this.count = count;
        this.title = name;
        this.hardCover = hardCover;
        this.price = price;
    }

    public void addToCart(User user){
        if(count > 0){
            user.makePayment(this);
            count--;
        }else{
            String message = title + " currently not available";
            throw new ProductNotAvailableException(message);
        }
    }

    public double getPrice(){
        return (hardCover)? 1.2 * price: price;
    }

    @Override
    public boolean checkIfAvailable(Verification verification){
        return verification.verify(this) && count > 0;
    }

    public int getCount(){
        return count;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return count == book.count && Double.compare(book.price, price) == 0 &&
                hardCover == book.hardCover && Objects.equals(title, book.title);
    }

}
