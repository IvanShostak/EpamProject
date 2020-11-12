package com.epam.automation.jcoll.optask.six;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StringOfFile {
    public static void main(String args[]) {
        List<String> stringList = new ArrayList<>();
        String FileName = "./src/main/resources/file";
        try (BufferedReader reader = new BufferedReader(new FileReader(FileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringList.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(stringList);
        System.out.println(stringList);
}}
