package com.xworkz.Runner;

import com.xworkz.implenents.Application;
import com.xworkz.interfacejava.Mobile;

public class MobileRunner {
    public static void main(String[] args) {

        Mobile mobile=new Application();
        mobile.batteryInfo();
        mobile.installApp();
        mobile.makeCall();
        mobile.storageInfo();

        Mobile.mobileSpecs();

        System.out.println(Mobile.batteries);
        System.out.println(Mobile.brand);
        System.out.println(Mobile.noOfCameras);
    }
}
