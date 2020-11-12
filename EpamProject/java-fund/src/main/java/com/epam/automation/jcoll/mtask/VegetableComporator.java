package com.epam.automation.jcoll.mtask;

import java.util.Comparator;

public class VegetableComporator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
