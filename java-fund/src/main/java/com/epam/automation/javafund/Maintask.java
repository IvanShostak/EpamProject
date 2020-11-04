package com.epam.automation.javafund;
import java.util.*;

public class Maintask {
    static Scanner scn = new Scanner(System.in);
    public static void hello(){
        Scanner scn = new Scanner(System.in);
        String name = new String();
        System.out.println("Введите ваше имя");
        name = scn.next();
        System.out.println("Hello, " + name);
    }

    public static void reverse(String[] k){
        System.out.println("Обратный порядок командной строки: ");
        for (int i = k.length - 1; i > -1; i--) {
            System.out.print(" " + k[i]);
        }
    }

    public static void newLine(){
        System.out.println("Введите кол-во случайных чисел");
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();
    int arr[] = new int[size];
    Random m = new Random();
        System.out.print("Случайные числа в строку: ");
        for(int i = 0;i<size;i++){
        arr[i] = m.nextInt(100);
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Случайные числа с новой строки: ");
        for(int i = 0;i < size; i++){
        System.out.println(arr[i]);
        }
    }

    public static void sum(String[] k){
        int[] arr = new int[k.length];
        int sum = 0;
        int product = 1;
        for(int i = 0;i< k.length;i++){//перевод в int
            arr[i] = Integer.parseInt(k[i]);
        }
        for(int i = 0;i< k.length;i++){
            sum +=arr[i];
            product *= arr[i];
        }
        System.out.println("Сумма = " + sum +"\nПроизведение = " +product);
    }
    public static void months(){
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        System.out.print("Введите число от 1 до 12: ");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if(number !=0 && number < 13){
            for(int i = 0;i < months.length;i++){
                if((i+1) == number){
                    System.out.println("Ваш месяц = " + months[i]);
                }
            }
        } else{
            System.out.println("Вы ввели некорректное число");
        }
    }
    static int c;
    public static void main(String args[]) throws IllegalAccessException {
        System.out.println("                menu");
        System.out.println("1.Приветствовать любого пользователя при вводе его имени через командную строку.");
        System.out.println("2.Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        System.out.println("3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку");
        System.out.println("4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
        System.out.println("5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
        System.out.println("6.Выйти");

        while(c != 6){
            System.out.print("Введите ваш выбор: ");
            c = scn.nextInt();
            switch (c) {
                case 1:
                    hello();
                    continue;
                case 2:
                    reverse(args);
                    continue;
                case 3:
                    newLine();
                    continue;
                case 4:
                    sum(args);
                    continue;
                case 5:
                    months();
                    continue;
                case 6:
                    break;
                default:
                    throw new IllegalAccessException("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }
}
