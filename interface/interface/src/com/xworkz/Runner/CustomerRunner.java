package com.xworkz.Runner;

import com.xworkz.implenents.Customer;
import com.xworkz.interfacejava.Bank;

public class CustomerRunner {
    public static void main(String[] args) {
        Bank bank = new Customer();
        {
            bank.depositMoney();
            bank.withdrawMoney();
            bank.loanInfo();
            bank.accountInfo();

            Bank.bankPolicy();

            System.out.println(Bank.bankName);
            System.out.println(Bank.noOfATMs);
            System.out.println(Bank.totalBranches);
        }
    }
}
