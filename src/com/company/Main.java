package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] getallen = new int[3];
        int positie = 0;
        int getal;

        do {
            System.out.print("Geef getal in (negatief om te stoppen): ");
            getal = Integer.parseInt(scanner.nextLine());
            if (getal >= 0) {
                if (positie == getallen.length) {
                    int [] temp = new int[getallen.length+1];
                    System.arraycopy(getallen, 0, temp,0 , getallen.length);
                    getallen = temp;
                }
                getallen[positie] = getal;
                positie++;
            }
        } while(getal >= 0);

        Arrays.sort(getallen,0,positie);
        for (int i = 0; i < positie; i++) {
            System.out.println(getallen[i]);
        }
    }
}
