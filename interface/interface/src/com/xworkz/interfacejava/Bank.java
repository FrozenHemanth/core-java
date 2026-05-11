package com.xworkz.interfacejava;

public interface Bank {


    int totalBranches = 120;
    String bankName = "SecureBank";
    int noOfATMs = 500;

    void depositMoney();
    void withdrawMoney();

    default void loanInfo() {
        System.out.println("Loan details are  in Bank interface");
    }

    default void accountInfo() {
        System.out.println("Account information is defined inside Bank interface");
    }

    static void bankPolicy() {
        System.out.println("Bank policies are  in Bank interface");
    }
}
