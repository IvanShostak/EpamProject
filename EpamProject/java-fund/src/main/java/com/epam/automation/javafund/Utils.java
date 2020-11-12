package com.epam.automation.javafund;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Utils {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void hello() throws IOException {
        System.out.println("Введите ваше имя");
        String name = reader.readLine();
        System.out.println("Hello, " + name);
    }

    public static void reverse(String[] k){
        System.out.println("Обратный порядок командной строки: ");
        for (int i = k.length - 1; i > -1; i--) {
            System.out.print(" " + k[i]);
        }
    }

    public static void newLine() throws IOException {
        System.out.println("Введите кол-во случайных чисел");
        String sizeString = reader.readLine();
        int size = Integer.parseInt(sizeString);
        int arr[] = new int[size];
        Random random = new Random();
        System.out.print("Случайные числа в строку: ");
        for(int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Случайные числа с новой строки: ");
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }

    public static void sum(String[] k){
        int[] arr = new int[k.length];
        int sum = 0;
        int product = 1;
        for(int i = 0; i < k.length; i++) {
            arr[i] = Integer.parseInt(k[i]);
        }
        for(int i = 0; i < k.length; i++){
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Сумма = " + sum +"\nПроизведение = " +product);
    }

    public static void months() throws IOException {
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        System.out.print("Введите число от 1 до 12: ");
        String numberString = reader.readLine();
        int number = Integer.parseInt(numberString);
        if(number != 0 && number < 13){
            for(int i = 0; i < months.length; i++) {
                if((i + 1) == number){
                    System.out.println("Ваш месяц = " + months[i]);
                }
            }
        } else{
            System.out.println("Вы ввели некорректное число");
        }
    }

}
