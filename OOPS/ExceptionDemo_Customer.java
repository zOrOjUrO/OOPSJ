package oopsj.OOPS;
/*
Design and implement a Java program for the following requirements:
    a) An Exception class called Demonetization Exception which returns the statement that
    says “Deposit of Old currency of (Rs_____) crosses Rs. 5,000 and cannot be Deposited”.
    b) A class called ‘Account’ that creates account with 500 Rs minimum balance with
    following methods.
        i. deposit(amount, currencyType) method to deposit amount. This class should
        handle “Demonetization Exception” and print the message defined in this Exception
        class. If a currency type is “OLD” and the amount is greater than 5,000 then throw
        the Demonetization Exception, otherwise update the balance.
        ii. currBalance() method that displays balance amount in the account.
        iii. withdraw(amount) method to withdraw amount and update the balance. Use proper
        control structure to check Balance should not go less than 500.
    c) A ‘Customer’ class that creates Account object and call the methods deposit(),
    withdraw() and currBalance() based on the user choice.
 */

import java.nio.file.AccessMode;
import java.util.Scanner;

class DemonetizationException extends Exception{
    DemonetizationException(float amount){
        System.out.println("Deposit of Rs. "+amount+" crosses Rs. 5,000 and cannot be Deposited.\n");
    }
}

class Account{
    float balance;

    Account(){
        this.balance = 500;
    }

    void deposit(float amount, String currencyType){
        try{
            if(currencyType.equalsIgnoreCase("OLD") && amount > 5000)
                throw new DemonetizationException(amount);
            else {
                this.balance = this.balance + amount;
                System.out.println("\n\tRs. "+amount+" Deposited Successfully!");
            }
        }
        catch (DemonetizationException e){
            System.out.println(e);
        }
    }

    void withdraw(float amount){
        if(amount > balance)
            System.out.println("\t\t\tCannot Withdraw!\n\t\t\tNot Enough Funds!\n");
        else if(amount > (balance-500))
            System.out.println("\t\t\tCannot Withdraw!\n\t\tMinimum Balance Required is Rs. 500!\n");
        else {
            balance = balance - amount;
            System.out.println("\n\tRs. "+amount+" Withdrawn Successfully!");
        }
    }

    void currBalance(){
        System.out.println("Current Balance:\t"+balance);
    }
}

public class ExceptionDemo_Customer {
    public static void main(String[] args){
        int choice;
        float amount;
        String currencyType;
        System.out.println("\tPROGRAM TO DEMONSTRATE CUSTOM EXCEPTION HANDLING\n\n");
        Scanner inLine = new Scanner(System.in);
        Account customer = new Account();
        System.out.println("USER ACCOUNT HAS BEEN CREATED.\nFEEL FREE TO USE THE ACCOUNT NOW!\n");
        while (true){
            System.out.print("\n1 - DEPOSIT CREDS\n2 - WITHDRAW CREDS\n3 - SHOW BALANCE\nAny Other Number to Exit: ");
            choice = inLine.nextInt();
            switch (choice){
                case 1:
                    System.out.print("\nEnter the amount you wish to deposit: ");
                    amount = inLine.nextFloat();
                    System.out.print("\nType of Currency?OLD:NEW :: ");
                    currencyType = inLine.next();
                    customer.deposit(amount, currencyType);
                    break;
                case 2:
                    System.out.print("\nEnter the amount you wish to withdraw: ");
                    amount = inLine.nextFloat();
                    customer.withdraw(amount);
                    break;
                case 3:
                    customer.currBalance();
                    break;
                default:
                    return;
            }
        }
    }
}
