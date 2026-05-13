package com.xworkz.interfaces.inner;

public class BoatBluetooth implements Bluetooth{
    @Override
    public void connect() {
        System.out.println("connecting with BoatHeadset");
    }

    @Override
    public void discunnect() {
        System.out.println("discunnect in boatHeadset");
    }
}
