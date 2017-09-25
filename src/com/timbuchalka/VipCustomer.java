package com.timbuchalka;

/**
 * Created by KH389659 on 25/09/2017.
 */
public class VipCustomer {

    private String vipCustomerName;
    private double vipCustomerCreditLimit;
    private String vipCustomerEmailAdress;

    //Construtor sem parametros, pegando os parametros Criados no terceiro construtor
    public VipCustomer() {
        this("Default Name", 50000.00, "Default@email.com");

    }
    //Construtor com 2 parametros, criado para pegar 2 parametros "dados"
    public VipCustomer(String vipCustomerName, double vipCustomerCreditLimit) {
        this(vipCustomerName,vipCustomerCreditLimit,"unknown.com");
    }
    //Construtor com todos os parametros, base para os outros construtores..
    public VipCustomer(String vipCustomerName, double vipCustomerCreditLimit, String vipCustomerEmailAdress) {
        this.vipCustomerName = vipCustomerName;
        this.vipCustomerCreditLimit = vipCustomerCreditLimit;
        this.vipCustomerEmailAdress = vipCustomerEmailAdress;
    }


    public String getVipCustomerName() {
        return vipCustomerName;
    }

    public double getVipCustomerCreditLimit() {
        return vipCustomerCreditLimit;
    }

    public String getVipCustomerEmailAdress() {
        return vipCustomerEmailAdress;
    }

}