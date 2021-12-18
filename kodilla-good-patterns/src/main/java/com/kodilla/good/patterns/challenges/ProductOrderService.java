package com.kodilla.good.patterns.challenges;

public class ProductOrderService{

    private final Verification users;
    private final Verification repository;

    public ProductOrderService(){
        users = new Users();
        repository = new Repository();
    }

    public ProductOrderService(Verification users, Verification repository){
        this.users = users;
        this.repository = repository;
    }

    public void takeAnOrder(User user, Item item){
        if(!user.checkIfAvailable(users))
            throw new UserNotFoundException("User not found");
        if(!repository.verify(item))
            throw new ProductNotAvailableException("Not available");
        else{
            item.addToCart(user);
            System.out.println("Transaction completed");
        }
    }

    public void addUser(Data user){
        users.add(user);
    }

    public void addItem(Data item){
        repository.add(item);
    }

    public Verification getUsers(){
        return users;
    }

    public Verification getRepository(){
        return repository;
    }
}
