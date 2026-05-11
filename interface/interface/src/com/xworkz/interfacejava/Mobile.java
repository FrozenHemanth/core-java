package com.xworkz.interfacejava;

public interface Mobile {

        int batteries = 1;
        String brand = "APPLE";
        int noOfCameras = 3;

        void makeCall();
        void installApp();

        default void batteryInfo() {
            System.out.println("Battery details are available in Mobile interface");
        }

        default void storageInfo() {
            System.out.println("Storage information is defined in Mobile interface");
        }

        static void mobileSpecs() {
            System.out.println("Mobile specifications are  from Mobile interface");
        }
    }

