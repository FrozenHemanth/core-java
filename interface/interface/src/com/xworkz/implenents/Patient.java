package com.xworkz.implenents;

import com.xworkz.interfacejava.Hospetal;


public class Patient implements Hospetal {

    @Override
    public void takeAppointment() {
        System.out.println("takeappointment is implemented in patient class");
    }
    @Override
    public void cancelAppointment() {
        System.out.println("cancelappoint is implemented in patient class");

    }
}
