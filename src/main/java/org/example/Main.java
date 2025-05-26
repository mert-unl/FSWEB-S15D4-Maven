package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

checkForPalindrome("I did, did I?");
        convertDecimalToBinary(13);
    }


    public static boolean checkForPalindrome(String input) {

        String newInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);

        String reverse = new StringBuilder(newInput).reverse().toString();



        if (newInput.equals(reverse)) {
            return true;
        } else return false;


    }


    public static String convertDecimalToBinary(int input) {

        // % KALANI VERİYOR
        // / KAÇ KEZ BÖLÜNDÜĞÜNÜ VERİYOR

        int sayi = input;
        LinkedList<Integer> a = new LinkedList();

        while (sayi > 0) {
            int kalan1 = sayi % 2;

            a.addFirst(kalan1);

            sayi = sayi / 2;
        }

        String b = a.toString().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(b);

        return b;


    }

}