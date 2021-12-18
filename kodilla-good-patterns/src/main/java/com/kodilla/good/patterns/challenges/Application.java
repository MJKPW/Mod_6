package com.kodilla.good.patterns.challenges;

public class Application{
    public static void main(String[] args){
        Book firstBook = new Book(2, 20, "Brave New World", false);
        Book secondBook = new Book(2, 60, "Fahrenheit 451", true);
        User firstUser = new User(100, "seth", "catsAndDogs");

        Verification users = new Users();
        users.add(firstUser);

        Verification repository = new Repository();
        repository.add(firstBook);
        repository.add(secondBook);

        ProductOrderService service = new ProductOrderService(users, repository);
        service.takeAnOrder(firstUser, firstBook);
        service.takeAnOrder(firstUser, secondBook);

        System.out.println(firstUser.getBalance());
    }
}
