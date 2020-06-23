package br.com.leo.biblioteca.estruturas;

import java.util.LinkedList;

public class LkdList {
    public static void playLinkedList(){
        // Create a LinkedList
        LinkedList<String> lkdlist = new LinkedList<String>();

        lkdlist.add("F");
        lkdlist.add("B");
        lkdlist.add("D");
        lkdlist.add("E");
        lkdlist.add("C");

        System.out.println("Valores originais para LinkedList sem First e Last: " + lkdlist);

        lkdlist.addLast("Z");
        lkdlist.addFirst("A");
        lkdlist.add(1, "A2");

        System.out.println("Valores originais para LinkedList: " + lkdlist);

        String x = lkdlist.get(1);
        System.out.println("String retornada com get(1): " + x + "\nValores para LinkedList após get(1): " + lkdlist);

        x = lkdlist.element();
        System.out.println("String retornada com element() : " + x + "\nValores para LinkedList após element(): " + lkdlist);

        lkdlist.removeFirst();
        lkdlist.removeLast();

        x = lkdlist.get(1);
        System.out.println("String retornada com get(1): " + x + "\nValores para LinkedList após get(1): " + lkdlist);

        x = lkdlist.element();
        System.out.println("String retornada com element() : " + x + "\nValores para LinkedList após element(): " + lkdlist);

        lkdlist.set(1, lkdlist.get(1) + "Modificada");
        System.out.println("\nValores para LinkedList após set(1): " + lkdlist);

        String peekStr = lkdlist.peek();
        System.out.println("String retornada com peek() : " + peekStr + "\nValores para LinkedList após peek(): " + lkdlist);

        String pollStr = lkdlist.poll();
        System.out.println("String retornada com poll() : " + pollStr + "\nValores para LinkedList após poll(): " + lkdlist);
    }
}
