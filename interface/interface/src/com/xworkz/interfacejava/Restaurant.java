package com.xworkz.interfacejava;

public interface Restaurant {
    int totalTables = 50;
    String restaurantName = "TastyBites";
    int noOfChefs = 10;

    void placeOrder();
    void cancelOrder();

    default void menuInfo() {
        System.out.println("Menu details are maintained in Restaurant interfase");
    }

    default void deliveryInfo() {
        System.out.println("Delivery information is defined inside Restaurant interface");
    }

    static void restaurantPolicy() {
        System.out.println("Restaurant policies are declared in Restaurant interface");
    }
}
