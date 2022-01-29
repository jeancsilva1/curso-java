/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao09_Construtores_Encapsulamento.Entities;

/**
 *
 * @author Jean
 */
public class Account {

    private Integer number;
    private String holder;
    private Double balance;

    public Account() {
    }

    public Account(Double balance) {
        this.balance = balance;
    }
    
    
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

   
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

   
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account " + number + ", Holder: " + holder + ", Balance: $" + balance +"\n";
    }

}
