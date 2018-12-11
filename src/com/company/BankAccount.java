package com.company;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String accountHolder;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this("eben", 1000, "eben.eben");
    }

    public BankAccount(String accountHolder,  int balance, String email){
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.email = email;
    }

    public void setAccountNumber(int number){
        this.accountNumber = number;
    }

    public void setBalace(int number){
        this.balance = number;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAccountHolder(String name){
        this.accountHolder = name;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalace(){
        return this.balance;
    }
    public String getEmail(String email){
        return this.email;
    }
    public String getAccountHolder(String name){
        return this.accountHolder;
    }

    public void deposit(int money){
        System.out.println("old balance = " + this.balance);
        this.balance += money;
        System.out.println("new balance = " + this.balance);

    }

    public void withdraw(int money){
        if(this.balance - money < 0){
            System.out.printf("insufficient funds");
        } else {
            this.balance -= money;
            System.out.println("new balance = " + this.balance);
        }

    }


}
