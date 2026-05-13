package com.xworkz.interfaces.inner;

public class LenovoRemote implements Remote{
    @Override
    public void turnOn() {
        System.out.println("turnon mthod executing in lenovoremote");
    }

    @Override
    public void turnOff() {
        System.out.println("turnOff method running in LenovoRemote");
    }
}
