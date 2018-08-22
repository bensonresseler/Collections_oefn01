package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hoeveel getallen wil u inlezen? ");
        int aantalGetallen = Integer.parseInt(scanner.nextLine());
        int [] getallen = new int[aantalGetallen];

        for (int i = 0; i < getallen.length; i++) {
            System.out.print("Geef getal: ");
            getallen[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("De gesorteerde lijst:%n ");
        Arrays.sort(getallen);
        for (int i = 0; i < getallen.length; i++) {
            System.out.printf("%d%n", getallen[i]);
        }
    }
}
