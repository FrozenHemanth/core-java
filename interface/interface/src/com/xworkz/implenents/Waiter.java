package com.xworkz.implenents;

import com.xworkz.interfacejava.Restaurant;

public class Waiter implements Restaurant {
    @Override
    public void cancelOrder() {
        System.out.println("cancelorder is executing in Waiter class");
    }

    @Override
    public void placeOrder() {
        System.out.println("placeorder by waiter");
    }
}
