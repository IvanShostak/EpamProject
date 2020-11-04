package com.epam.automation.javaclass;

public class Customers {
    private static int totalCustomers = 0;
    private int id = totalCustomers++;

    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long creditCardNumber;
    private String bankAccountNumber;


    public Customers(String surname,String name,String patronymic,String address,long creditCardNumber,String bankAccountNumber){//конструктор
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public static int getTotalCustomers() {
        return totalCustomers;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}
