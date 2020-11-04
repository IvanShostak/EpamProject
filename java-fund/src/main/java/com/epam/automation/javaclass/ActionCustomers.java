package com.epam.automation.javaclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActionCustomers {
    private String nameOfBank;
    private ArrayList<Customers> customersList = new ArrayList<>();

    public ActionCustomers(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    void addCustomer(Customers customers){
        customersList.add(customers);
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public ArrayList<Customers> getCustomerListByAlphabet(){
        ArrayList<Customers> custlist = new ArrayList<>(customersList);
        Collections.sort(custlist, new Comparator<Customers>() {
            @Override
            public int compare(Customers cust1, Customers cust2) {
                return cust1.getSurname().compareToIgnoreCase(cust2.getSurname());
            }
        });
        return custlist;
    }
    public  ArrayList<Customers> getCustomerListInterval(long cardNumber1, long cardNumber2){
        ArrayList<Customers> custlist = new ArrayList<>();
        for (Customers cust : customersList){
            if (cardNumber1 < cust.getCreditCardNumber() &&cust.getCreditCardNumber()< cardNumber2){
                custlist.add(cust);
            }
        }
        return custlist;
    }
}



