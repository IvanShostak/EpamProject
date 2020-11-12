package com.epam.automation.jcoll.mtask;
//ПРОПИСАТЬ ВСЁ ПРО ОВОЩИ, КАЛЛОРИЙНОСТЬ, ВЕС.
public abstract class Vegetable {
    private int calorie;
    private int weight;
    private String name;
    private enum VegetableList {Vegetable, CARROT, POTATO, TOMATO, CUCUMBER, ONION, PEPER}
    private VegetableList list = VegetableList.Vegetable;

    int getCalorie() {
        switch (list.valueOf(name)) {
            case CARROT: calorie = 30;
            break;
            case POTATO: calorie = 103;
            break;
            case TOMATO: calorie = 21;
            break;
            case CUCUMBER: calorie = 90;
            break;
            case ONION: calorie = 34;
            break;
            case PEPER: calorie = 49;
            break;
            default: calorie = 0; System.out.println("Неизвестный продукт");
        }
        return calorie;
    }
    public Vegetable(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
