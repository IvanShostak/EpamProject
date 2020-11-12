package com.epam.automation.jcoll.mtask;
//ИМЯ САЛАТА, КОМПОНЕНТЫ, КАЛЛОРИЙНОСТЬ.
import java.util.ArrayList;
import java.util.List;

public class Salad {
    String name;
    List<Vegetable> salad = new ArrayList<Vegetable>();

    public Salad(String name, Vegetable... components) {
        this.name = name;
        for (Vegetable vagetables : components) {
            this.salad.add(vagetables);
        }

    }

    public String getName() {
        return name;
    }

    public List<Vegetable> getSalad() {
        return salad;
    }

    private int coloriesCounter() {
        int sumOfColories = 0;
        for(Vegetable vegetable : salad) {
            sumOfColories += Math.round(((double) vegetable.getWeight() * vegetable.getCalorie())/100);
        }
        return sumOfColories;
    }

    @Override
    public String toString() {
        salad.sort(new VegetableComporator());
        String vegetableLowCalories = "; В салате '" + name + "' низкокаллорийными являются: ";
        for(Vegetable vegetable : salad) {
            int caloriesOfVegetableInSalad = (int) Math.round(((double) vegetable.getWeight() * vegetable.getCalorie())/100);
            if(caloriesOfVegetableInSalad > (coloriesCounter() * 0.1) && (caloriesOfVegetableInSalad < (coloriesCounter() * 0.5))) {
                vegetableLowCalories += vegetable.getName() + " ";
            }
        }
        return "Salad{" +
                "Name of salad = " + name + '\'' +
                ", vegetables in salad: =" + salad +
                "  Calories of salad = "+ this.coloriesCounter() +
                vegetableLowCalories +
                '}';
    }
}
