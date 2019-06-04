package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 write your code here
        BankAccount a = new BankAccount(123,5000);
        a.withdraw(1000);
        a.deposit(2000);

        System.out.println(a);

        //order();

    }

    public static void order(){

        ArrayList<BankAccount>  bankAccounts = new ArrayList<BankAccount>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the steps : ");

        int step = input.nextInt();

        int id_ctr = 0;

        for(int i=0;i<step;i++){



            System.out.println(" What do you want?  1.create account 2.deposit 3.withdraw");

            int choose = input.nextInt();

            switch (choose){
                case 1 :
                    System.out.println("How many money in account?");
                    int num= input.nextInt();
                    id_ctr=id_ctr+123;
                    BankAccount create = new BankAccount(id_ctr,num);
                    bankAccounts.add(create);

                    break;
                case 2 :
                    System.out.println("id of account you want to deposit?");
                    int id = input.nextInt();

                    System.out.println("How much deposit?");

                    int deposit= input.nextInt();

                       for(int j=0;j<bankAccounts.size();j++){
                           if(bankAccounts.get(j).getAccount_id()==id){
                               bankAccounts.get(j).deposit(deposit);
                               System.out.println(bankAccounts.get(j));
                           }
                       }
                    break;
                case 3 :
                    System.out.println("id of account you want to withdraw?");
                    int id_withdraw = input.nextInt();

                    System.out.println("How much withdraw?");

                    int withdraw= input.nextInt();

                    for(int j=0;j<bankAccounts.size();j++){
                        if(bankAccounts.get(j).getAccount_id()==id_withdraw){
                            bankAccounts.get(j).withdraw(withdraw);
                            System.out.println(bankAccounts.get(j));
                        }
                    }
                  break;

            }

        }




    }



}
