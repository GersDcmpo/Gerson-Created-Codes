/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account2;

/**
 *
 * @author GrsnDcmpo
 */
public class Account2 {
   
    int id;
    String customer;
    double balance=0.0;
    
Account2(int id, String customer, double balance) {}
     

    public int getID() { 
        return id;
    }

    public String getCustomer() { 
        return customer;
    }

    public double getBalance() { 
        return balance;
    }

    public void setBalance(double balance) {}

    public String getCustomerName() {
        return CustomerName;
    }

    public int transferTo() {
        int amount;
        amount = 0;
        if (amount >= balance);
            balance = (balance - amount);
        else
            System.out.println("Amount withdrawn exeeds the current balance.");
        return balance;
    }
}
