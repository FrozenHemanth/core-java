package com.xworkz.interfaces;

public class DmartSupermarket implements Supermarket{
    @Override
    public void purchase() {
        System.out.println("purchase is executing in DmartSupermarket");

    }

    @Override
    public void discount() {
        System.out.println("discount in Dmart");
    }
}
