package com.epam.automation.javaclass;

import java.lang.*;
import java.util.*;

public class Run {
    public static void main(String args[]) {

        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1L,"Шостак", "Иван", "Валентинович", "Минск", 453_532_244_324L, "41343242"));
        customers.add(new Customer(2L,"Ханецкий", "Андрей", "Романович", "Минск", 464_435_413_446L, "12356753"));
        customers.add(new Customer(3L,"Нестерович", "Павел", "Русланович", "Минск", 876_462_334_434L, "53535412"));
        customers.add(new Customer(4L,"Богдевич", "Сергей", "Александрович", "Гродно", 537_534_545_434L, "76734244"));

        System.out.println("Сортировка по Фамилии: ");
        List<Customer> listName = CustomerUtils.getCustomerListByAlphabet(customers);
        for (Customer cust : listName) {
            System.out.println(cust);
        }

        System.out.println("Проверка на интервал карты");
        List<Customer> listLocal = CustomerUtils.getCustomerListInterval(10000L, 464_435_413_446L, customers);
        for (Customer cust : listLocal) {
            System.out.println(cust);
        }

    }

}
