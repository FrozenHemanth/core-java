package com.xworkz.implenents;

import com.xworkz.interfacejava.Mobile;

public class Application implements Mobile {

    @Override
    public void makeCall() {
        System.out.println("make call is in application class");

    }

    @Override
    public void installApp()
    {
        System.out.println("installApp process is handled inside Application class");

    }
}

