package ru.mirea.chimbiyan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] Array1;
        int[] Array2;
        int arraylen;

        System.out.println("Введите размер массивов");
        Scanner scan = new Scanner(System.in);
        arraylen = scan.nextInt();
        Array1 = new int[arraylen];
        Array2 = new int[arraylen];

        Random random = new Random();
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = random.nextInt(-10, 10);
            Array2[i] = random.nextInt(-10, 10);
        }

        System.out.println(Arrays.toString(Array1));
        System.out.println(Arrays.toString(Array2));

        Array1 = Arrays.stream(Array1).distinct().toArray();
        Array2 = Arrays.stream(Array2).distinct().toArray();

        if (Array1.length < Array2.length) {
            Arrays.sort(Array1);
            Search(Array1, Array2);
        } else {
            Arrays.sort(Array2);
            Search(Array2, Array1);
        }
    }

    public static void Binsearch(int[] mass, int numtofind) {
        int low = 0;
        int high = mass.length - 1;
        int middle;
        while(low <= high) {
            middle = (low + high) / 2;
            int num = mass[middle];
            if (num == numtofind) {
                System.out.println(mass[middle]);
                return;
            } else if (num > numtofind) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
    }
    public static void Search(int[] shortt, int[] longg) {
        for (int i = 0; i < longg.length; i++) {
            Binsearch(shortt, longg[i]);
        }
    }
}
