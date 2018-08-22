package com.company;

import java.util.Arrays;

public class DynArray {
    private int [] elementen = new int [3];
    private int aantal;

    public DynArray(){

    }
    public int size(){
        return aantal;
    }
    public void add(int getal){
        if (aantal == elementen.length) {
            elementen = resize(elementen);
        }
        elementen[aantal] = getal;
        aantal++;
    }
    public int get(int index) {
        if (index >= aantal) throw new ArrayIndexOutOfBoundsException("Index is onbereikbaar.");
        return elementen[index];
    }
    public void sort(){
        Arrays.sort(elementen,0,aantal);
    }
    private int[] resize(int[] getallen){
        int [] temp = new int[getallen.length * 2];
        System.arraycopy(getallen, 0, temp,0 , getallen.length);
        return temp;
    }
}
