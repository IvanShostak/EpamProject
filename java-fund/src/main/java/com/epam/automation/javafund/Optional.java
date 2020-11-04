package com.epam.automation.javafund;

import java.util.Random;
import java.util.Scanner;

public class Optional {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Введите размерность матрицы: ");
        int n = scn.nextInt();

        int[][] array = new int[n][n];
        init(array, n);
        show(array);
        maxel(array, n);
    }
    public static void maxel(int[][] arr,int n){
        int max = Integer.MIN_VALUE;
        int i_max = 0;
        int j_max = 0;

        for(int i = 0;i < n; i++){
            for(int j = 0;j < n; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    i_max = i;
                    j_max = j;
                }
            }
        }
        System.out.println("\nМаксимальный элемент:" + max + " Его индексы:" + i_max + ", " +j_max);

        int[][] newarray = new int[n-1][n-1];
        int new_i = 0;
        int new_j = 0;
        for(int i = 0;i < n; ++i){
            for(int j = 0;j < n; ++j){
                if(i != i_max) {
                    if(j != j_max){
                    newarray[new_i][new_j] = arr[i][j];
                    ++new_j;
                }
                }else{
                    --new_i;
                    break;
                }
            }
            ++new_i;
            new_j = 0;
        }
        show(newarray);
    }
    public static void init(int[][] array, int n){
        System.out.println("Введите числа для интервала: ");
        int m = scn.nextInt();
        Random r = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = r.nextInt((m + m)+ 1) - m;
            }
        }
    }
    public static void show(int[][] array) {
        for (int[] values:array) {
            System.out.println();
            for (int value:values) {
                System.out.print(" " + value);
            }
        }

    }
}
