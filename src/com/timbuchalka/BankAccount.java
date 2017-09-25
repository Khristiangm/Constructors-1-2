package com.timbuchalka;

/**
 * Created by KH389659 on 25/09/2017.
 */
public class BankAccount {
    //Fields
    private double accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //
    public BankAccount() {
        this(12345, 10000, "Default Name", "Default Adress", "Default Phone");
        System.out.println("Empty Parameters Constructor Was Called");

    }

    public BankAccount(double accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("BankAccount Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(99999,100.55, customerName, customerEmail, customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //Metodo Criado para Depositar dinheiro da Conta definida por "BALANCE"
    public void deposit(double depositAmount, String customerName) {
        this.balance += depositAmount;
        this.customerName = customerName;
        System.out.println("Deposit Successful,Your Currently Balance " + this.customerName + " is: " + this.balance);
    }

    //Metodo Criado para Retirar dinheiro da Conta definida por "BALANCE"
    public void withdrawal(double withdrawalAmount, String customerName) {
        this.customerName = customerName;
        //Condição criada para o caso do Cliente não ter dinheiro no banco
        if (balance - withdrawalAmount < 0) {
            System.out.println(this.customerName + " you Don't have money Enough, Your currently Balance is: " + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdraw Successful, Your Currently Balance " + this.customerName + " is: " + this.balance);
        }
    }

    // INSERINDO OS GETTERS AND SETTERS PARA MANIPULAR OS ATRIBUTOS ACIMA
    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getcustomerEmail() {
        return customerEmail;
    }

    public void setcustomerEmail(String email) {
        this.customerEmail = email;
    }

    public String getcustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setcustomerPhoneNumber(String phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }
}
