package com.xworkz.interfaces.inner;

public class SonyRemote implements Remote {

    @Override
    public void turnOn() {
        System.out.println("Turn on is executing in SonyRemote");

    }

    @Override
    public void turnOff() {
        System.out.println("turn offf is executing in SonyRemote");
    }
}
