package com.xworkz.implenents;

import com.xworkz.interfacejava.Bank;

public class Customer implements Bank {

    @Override
    public void depositMoney() {
        System.out.println("All depositmoney is executed in customer class");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("withdrowmoney is running in class customer");

    }
}
