package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        //Instanciando o OBJETO da classe BankAccount
//        //BankAccount itauAccount = new BankAccount();//12345, 10000, "Khristian", "Khris@gmail.com", "99999-9999");
//        System.out.println(itauAccount.getAccountNumber());
//        System.out.println(itauAccount.getBalance());
//        System.out.println(itauAccount.getCustomerName());
//        System.out.println(itauAccount.getcustomerEmail());
//        System.out.println(itauAccount.getcustomerPhoneNumber());

//        BankAccount santanderAccount = new BankAccount("Khris", "Khris@khris", "9999-9999");
//        System.out.println(santanderAccount.getAccountNumber());
//        System.out.println(santanderAccount.getBalance());
//        System.out.println(santanderAccount.getCustomerName());
//        System.out.println(santanderAccount.getcustomerEmail());
//        System.out.println(santanderAccount.getcustomerPhoneNumber());

//        //Instanciando um SEGUNDO OBJETO da classe BankAccount
//        BankAccount santanderAccount = new BankAccount();
//
//        //Buscando o Metodo "Deposit" Criado na Classe Bank Account para o Primeiro OBJETO.
//        itauAccount.deposit(1500, "Khristian");
//
//        //Buscando o Metodo "Deposit" Criado na Classe Bank Account para o Segundo OBJETO.
//        santanderAccount.deposit(5000, "Thais");
//
//        //Buscando o Metodo "Withdrawal" Criado na Classe Bank Account para o Primeiro OBJETO.
//        itauAccount.withdrawal(2500, "Khristian");
//
//        //Buscando o Metodo "Withdrawal" Criado na Classe Bank Account para o Segundo OBJETO.
//        santanderAccount.withdrawal(5000, "Thais");

        VipCustomer person = new VipCustomer();
        System.out.println(person.getVipCustomerName());
        System.out.println(person.getVipCustomerEmailAdress());

        VipCustomer person2 = new VipCustomer("Bob",25000.00);
        System.out.println(person2.getVipCustomerName());

        VipCustomer person3 = new VipCustomer("Khristian",50000.00,"Khris@khris.com");
        System.out.println(person3.getVipCustomerName());
        System.out.println(person3.getVipCustomerEmailAdress());
    }
}
