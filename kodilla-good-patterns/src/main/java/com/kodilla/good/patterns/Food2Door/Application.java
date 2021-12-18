package com.kodilla.good.patterns.Food2Door;

public class Application {
    public static void main(String[] args) {

        Order order = new Order();

        Product chicken = new Product("Chicken", 20.99, 20);
        Product lamb = new Product("Lamb", 25.99, 15);
        Product apple = new Product("Apple", 2.99, 245);
        Product banana = new Product("Banana", 3.99, 100);
        Product carrot = new Product("Carrot", 2.99, 120);
        Product applePie = new Product("Apple pie", 30.99, 15);
        Product cheeseCake = new Product("Cheese cake", 25.99, 25);
        Product potato = new Product("Potato", 1.99, 160);
        Product salad = new Product("Salad", 5.99, 70);
        Product bread = new Product("Bread", 7.99, 50);
        Product water = new Product("Water", 1.99, 220);
        Product milk = new Product("Milk", 5.99, 120);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.addProduct(chicken);
        extraFoodShop.addProduct(lamb);
        extraFoodShop.addProduct(cheeseCake);
        extraFoodShop.addProduct(applePie);
        extraFoodShop.addProduct(water);
        extraFoodShop.addProduct(bread);
        extraFoodShop.addProduct(potato);

        HealthyShop healthyShop = new HealthyShop();
        healthyShop.addProduct(apple);
        healthyShop.addProduct(banana);
        healthyShop.addProduct(milk);
        healthyShop.addProduct(salad);
        healthyShop.addProduct(carrot);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.addProduct(apple);
        glutenFreeShop.addProduct(chicken);
        glutenFreeShop.addProduct(lamb);
        glutenFreeShop.addProduct(carrot);
        glutenFreeShop.addProduct(salad);

        System.out.println(extraFoodShop.getProvider() + " : ");
        System.out.println(extraFoodShop.showMenu());
        System.out.println(healthyShop.getProvider() + " : ");
        System.out.println(healthyShop.showMenu());
        System.out.println(glutenFreeShop.getProvider() + " : ");
        System.out.println(glutenFreeShop.showMenu());

        extraFoodShop.addToCart(order, chicken, 2);
        extraFoodShop.addToCart(order, applePie, 1);
        extraFoodShop.addToCart(order, cheeseCake, 2);

        healthyShop.addToCart(order, milk, 2);
        healthyShop.addToCart(order, banana, 4);
        healthyShop.addToCart(order, salad, 5);

        glutenFreeShop.addToCart(order, carrot, 10);
        glutenFreeShop.addToCart(order, apple, 15);
        glutenFreeShop.addToCart(order, lamb, 2);

        System.out.println(order);
        System.out.println("Bill " + order.getBill());
    }
}
