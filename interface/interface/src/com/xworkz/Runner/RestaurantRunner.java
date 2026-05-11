package com.xworkz.Runner;

import com.xworkz.implenents.Waiter;
import com.xworkz.interfacejava.Restaurant;

public class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant=new Waiter();
        restaurant.cancelOrder();
        restaurant.placeOrder();
        restaurant.deliveryInfo();
        restaurant.menuInfo();
        System.out.println("/////////////");
        Restaurant.restaurantPolicy();
        System.out.println("***************");
        System.out.println(Restaurant.restaurantName);
        System.out.println(Restaurant.noOfChefs);
        System.out.println(Restaurant.totalTables);
    }
}
