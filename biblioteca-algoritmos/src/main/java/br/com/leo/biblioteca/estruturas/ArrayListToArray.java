package br.com.leo.biblioteca.estruturas;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void arrayListToArray(){
        //Create an array list
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        System.out.println("Valores do Array 01: " + array);

        Integer arr[] = new Integer[array.size()];
        arr = array.toArray(arr);

        System.out.println("Valor de soma dos valores do Array: " + somaArray(arr));

        for(int i = 0; i < 200; i++){
            if(i%2 == 0){
                array2.add(i);
            }
        }

        System.out.println("Valores do Array 02: " + array2);

        Integer arr2[] = new Integer[array2.size()];
        arr2 = array2.toArray(arr2);

        System.out.println("Valor de soma dos valores do Array 2: " + somaArray(arr2));
    }

    public static void arrayListToArray(ArrayList<Integer> array){

    }

    private static int somaArray(Integer arr[]){
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }
}
