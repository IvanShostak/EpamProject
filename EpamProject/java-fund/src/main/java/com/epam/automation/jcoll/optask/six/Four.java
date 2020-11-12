package com.epam.automation.jcoll.optask.six;

import com.epam.automation.jcoll.mtask.VegetableComporator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Four {
    private static String poem =
            "Some say the world will end in fire\n"+
            "Some say in ice\n"+
            "From what I’ve tasted of desire\n"+
            "I hold with those who favor fire\n"+
            "But if it had to perish twice\n"+
            "I think I know enough of hate\n"+
            "To say that for destruction ice\n"+
            "Is also great\n"+
            "And would suffice\n";
    private static Object LineComporator;

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(poem.split("\n"));
        System.out.println("Первоначально:" + lines);

        lines.sort(new LineComporator());
        System.out.println("Стало:" + lines);
    }
}
