package com.epam.automation.javaclass;
import java.lang.*;
import java.util.*;
//customer
public class Run {
    public static void main(String args[]){
        ActionCustomers bank = new ActionCustomers("IvanBank");

        bank.addCustomer(new Customers("Шостак","Иван","Валентинович","Минск",453_532_244_324L,"41343242"));
        bank.addCustomer(new Customers("Ханецкий","Андрей","Романович","Минск",464_435_413_446L,"12356753"));
        bank.addCustomer(new Customers("Нестерович","Павел","Русланович","Минск",876_462_334_434L,"53535412"));
        bank.addCustomer(new Customers("Богдевич","Сергей","Александрович","Гродно",537_534_545_434L,"76734244"));

        System.out.println("Сортировка по Фамилии: ");
        ArrayList<Customers> listName = bank.getCustomerListByAlphabet();
        for (Customers cust : listName) {
            System.out.println(cust);
        }

        System.out.println("Проверка на интервал карты");
        ArrayList<Customers> listLocal = bank.getCustomerListInterval(10000,464_435_413_446L);
        for (Customers cust : listLocal) {
            System.out.println(cust);
        }

    }

}
