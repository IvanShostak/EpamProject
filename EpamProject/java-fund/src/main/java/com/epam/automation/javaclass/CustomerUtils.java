package com.epam.automation.javaclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerUtils {

    public static List<Customer> getCustomerListByAlphabet(List<Customer> custList){
        Collections.sort(custList, new Comparator<Customer>() {
            @Override
            public int compare(Customer cust1, Customer cust2) {
                return cust1.getSurname().compareToIgnoreCase(cust2.getSurname());
            }
        });
        return custList;
    }

    public  static List<Customer> getCustomerListInterval(Long cardNumberFrom, Long cardNumberTo, List<Customer> customerList){
        List<Customer> custlist = new ArrayList<>();
        for (Customer cust : customerList){
            if (cardNumberFrom < cust.getCreditCardNumber() && cust.getCreditCardNumber() < cardNumberTo){
                custlist.add(cust);
            }
        }
        return custlist;
    }
}
