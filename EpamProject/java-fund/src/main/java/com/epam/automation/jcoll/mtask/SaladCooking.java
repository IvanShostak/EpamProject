package com.epam.automation.jcoll.mtask;
//ПРИГОТОВЛЕНИЕ
public class SaladCooking {
    public static void main(String[] args) {
        Salad salad = new Salad("Summer salad", new VegetableNecessary("CARROT",140), new VegetableUnnecessary("POTATO",120), new VegetableNecessary("TOMATO",70), new VegetableNecessary("CUCUMBER",160), new VegetableUnnecessary("ONION",15), new VegetableNecessary("PEPER", 240));
        System.out.println(salad);
    }

}
