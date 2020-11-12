package com.epam.automation.javafund;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Optional {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность матрицы: ");
        String sizeString = reader.readLine();
        int size = Integer.parseInt(sizeString);
        int[][] array = new int[size][size];
        init(array, size);
        show(array);
        maxel(array, size);
    }

    public static void maxel(int[][] arr,int size) {
        int max = Integer.MIN_VALUE;
        int iMax = 0;
        int jMax = 0;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println("\nМаксимальный элемент:" + max + " Его индексы:" + iMax + ", " + jMax);

        int[][] newarray = new int[size - 1][size - 1];
        int iNew = 0;
        int jNew = 0;
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if(i != iMax) {
                    if(j != jMax) {
                    newarray[iNew][jNew] = arr[i][j];
                    ++jNew;
                }
                } else {
                    --iNew;
                    break;
                }
            }
            ++iNew;
            jNew = 0;
        }
        show(newarray);
    }

    public static void init(int[][] array, int size) throws IOException {
        System.out.println("Введите числа для интервала: ");
        String intervalString = reader.readLine();
        int interval = Integer.parseInt(intervalString);
        Random random = new Random();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                array[i][j] = random.nextInt((interval + interval) + 1) - interval;
            }
        }
    }

    public static void show(int[][] array) {
        for (int[] values : array) {
            System.out.println();
            for (int value : values) {
                System.out.print(" " + value);
            }
        }

    }
}
