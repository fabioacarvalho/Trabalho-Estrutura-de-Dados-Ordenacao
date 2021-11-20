package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ordem {

    public String selectionSort(int[] array) {

        //Primeiro Loop para percorrer o Array.
        //Não precisamos percorrer o array até o ultimo eleento pois segundo a lógico o ultimo já estara na posição correta.
        for (int i = 0; i < array.length -1; i++) {

            //Variavel que recebe o index do valor mínimo encontrado.
            int indexMinimo = i;

            //Neste Loop ele vai percorrer o array mas sempre pegando o proximo valor do Loop anterior, assim ele nunca page o mesmo.
            for (int j = i + 1; j < array.length; j++) {

                //Se o valor que estamos percorrendo agora for maior que o valor contigo no indexMinimo, então indexMinimo recebe o novo valor do index.
                if (array[j] < array[indexMinimo]) {
                    indexMinimo = j;
                }
            }

            //Criamos uma variavel auxiliar para armazenar o valor anterior para não perdermos o registro.
            //Então fazemos as trocas de posição dos valores.

            int auxiliar = array[indexMinimo];
            array[indexMinimo] = array[i];
            array[i] = auxiliar;
        }

        return Arrays.toString(array);

    }

    public String selectionSortDec(int[] array) {

        //Primeiro Loop para percorrer o Array.
        //Não precisamos percorrer o array até o ultimo eleento pois segundo a lógico o ultimo já estara na posição correta.
        for (int i = 0; i < array.length -1; i++) {

            //Variavel que recebe o index do valor mínimo encontrado.
            int indexMinimo = i;

            //Neste Loop ele vai percorrer o array mas sempre pegando o proximo valor do Loop anterior, assim ele nunca page o mesmo.
            for (int j = i + 1; j < array.length; j++) {

                //Se o valor que estamos percorrendo agora for maior que o valor contigo no indexMinimo, então indexMinimo recebe o novo valor do index.
                if (array[j] > array[indexMinimo]) {
                    indexMinimo = j;
                }
            }

            //Criamos uma variavel auxiliar para armazenar o valor anterior para não perdermos o registro.
            //Então fazemos as trocas de posição dos valores.

            int auxiliar = array[indexMinimo];
            array[indexMinimo] = array[i];
            array[i] = auxiliar;
        }

        return Arrays.toString(array);

    }


    public String bubbleSort(int[] array) {

        for (int ultimo = array.length - 1; ultimo > 0; ultimo--) {

            for (int i = 0; i < ultimo; i++) {

                if (array[i] > array[i+1]) {
                    substituir(array, i, i+1);
                }

            }

        }

        return Arrays.toString(array);
    }

    public String bubbleSortDec(int[] array) {

        for (int ultimo = array.length - 1; ultimo > 0; ultimo--) {

            for (int i = 0; i < ultimo; i++) {

                if (array[i] < array[i+1]) {
                    substituir(array, i, i+1);
                }

            }

        }

        return Arrays.toString(array);
    }

    public void substituir(int[] array, int i, int j) {
        int auxiliar = array[i];

        array[i] = array[j];
        array[j] = auxiliar;


    }


}
