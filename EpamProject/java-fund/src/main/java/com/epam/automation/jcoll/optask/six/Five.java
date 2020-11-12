package com.epam.automation.jcoll.optask.six;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Five {

        public static void main(String[] args) {
            List<Integer> list = createNewList();
            System.out.println(list);
            List<Integer> result = list.stream().sorted((o1, o2) -> o2).collect(Collectors.toList());
            System.out.println(result);
        }
    public static List<Integer> createNewList() {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 15; i++) {
            int number = -20 + random.nextInt(21 + 20);
            integers.add(number);
        }
        return integers;
    }

    }

