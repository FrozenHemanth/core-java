package com.xworkz.interfaces.inner;

import com.xworkz.interfaces.Supermarket;

public class LuluSuperMarket implements Supermarket {
    @Override
    public void purchase() {
        System.out.println("purchasing in luluSupermarket");
    }

    @Override
    public void discount() {
        System.out.println("discount in luluSupermarket");
    }
}
