package com.company;

public class BankAccount {

    private int account_id;

    private int money;

    public BankAccount(int account_id, int money) {
        this.account_id = account_id;
        this.money = money;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void deposit(int num){

        setMoney(getMoney()+num);

    }

    public void withdraw(int num){

        setMoney(getMoney()-num);

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account_id=" + account_id +
                ", money=" + money +
                '}';
    }
}
