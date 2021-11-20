package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Main {

    public static int[] vetorSelection = {3,6,8,1,4,9,0};

    public static int[] vetorBubble = {3,6,8,1,4,9,0};

    public static void main(String[] args) {

        Ordem order = new Ordem();

        System.out.println("");
        System.out.println("Metodo Selection Sort Crescente: ");
        System.out.println(order.selectionSort(vetorSelection));

        System.out.println("");
        System.out.println("Metodo Selection Sort Descrecente: ");
        System.out.println(order.selectionSortDec(vetorSelection));


        System.out.println("");
        System.out.println("Metodo Bubble Sort Crescente: ");
        System.out.println(order.bubbleSort(vetorBubble));

        System.out.println("");
        System.out.println("Metodo Bubble Sort Descrescente: ");
        System.out.println(order.bubbleSortDec(vetorBubble));


    }
}
