package ru.mirea.chimbiyan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int[] numberArray;
        int arrayLen;
        int numtofind;

        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        arrayLen = scan.nextInt();
        numberArray = new int[arrayLen];

        Random random = new Random();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(numberArray));

        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));

        System.out.println("Введите число для поиска:");
        numtofind = scan.nextInt();
        Binsearch(numberArray, numtofind);
    }

        public static void Binsearch(int[] mass, int numtofind) {
            int low = 0;
            int high = mass.length;
            int middle;
            int numiter = 1;
            while(low <= high) {
                middle = (low + high) / 2;
                int num = mass[middle];
                System.out.println(numiter);
                numiter++;
                if(num == numtofind){
                    System.out.println("Значение найдено под индексом "+middle);
                    return;
                } else if(num > numtofind){
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
            System.out.println("Искомого значения в массиве нет");
        }
    }
