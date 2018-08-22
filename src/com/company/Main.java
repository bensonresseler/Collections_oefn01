package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynArray<Integer> getallen = new DynArray<Integer>();
        int getal;

        do {
            System.out.print("Geef getal in (negatief om te stoppen): ");
            getal = Integer.parseInt(scanner.nextLine());
            if (getal >= 0) {
                getallen.add(getal);
            }
        } while(getal >= 0);
        getallen.sort();
        for (int i = 0; i < getallen.size(); i++) {
            System.out.println(getallen.get(i));
        }
    }
}
