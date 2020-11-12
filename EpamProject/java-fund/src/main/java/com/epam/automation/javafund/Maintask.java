package com.epam.automation.javafund;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maintask {
    private static final String CASE_CONGRATULATION = "1";
    private static final String CASE_REVERSE = "2";
    private static final String CASE_NEWLINE = "3";
    private static final String CASE_SUM = "4";
    private static final String CASE_MONTHS = "5";
    private static final String EXIT = "6";

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IllegalAccessException, IOException {
        String usersChoise = "";
        System.out.println("                menu");
        System.out.println("1.Приветствовать любого пользователя при вводе его имени через командную строку.");
        System.out.println("2.Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        System.out.println("3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку");
        System.out.println("4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
        System.out.println("5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
        System.out.println("6.Выйти");

        while(usersChoise != EXIT){
            System.out.print("Введите ваш выбор: ");
            usersChoise = reader.readLine();
            switch (usersChoise) {
                case CASE_CONGRATULATION:
                    Utils.hello();
                    continue;
                case CASE_REVERSE:
                    Utils.reverse(args);
                    continue;
                case CASE_NEWLINE:
                    Utils.newLine();
                    continue;
                case CASE_SUM:
                    Utils.sum(args);
                    continue;
                case CASE_MONTHS:
                    Utils.months();
                    continue;
                case EXIT:
                    break;
                default:
                    throw new IllegalAccessException("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }
}
