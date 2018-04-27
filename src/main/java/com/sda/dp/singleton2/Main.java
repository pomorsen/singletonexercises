package com.sda.dp.singleton2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ppomorsk on 26/04/2018.
 */
public class Main {
    public static void main(String[] args) {

        Konfiguracja k = new Konfiguracja();
        k.wczytajKonfiguracje();

        System.out.println(k.getZakresLiczby1());
        System.out.println(k.getZakresLiczby2());
        System.out.println(k.getIloscZapytan());
        System.out.println(k.getListaDostępnychDziałań());

        System.out.println("Policzymy się!");
        System.out.println("#################");
        Scanner input = new Scanner(System.in);

        int runda = 1;
        Random random = new Random();
        int losowaLiczba1 = 0;
        int losowaLiczba2 = 1;
        char losoweDzialanie;
        double wynik;

        while (runda < k.getIloscZapytan()) {
            losowaLiczba1 = random.nextInt(k.getZakresLiczby1());
            losowaLiczba2 = random.nextInt(k.getZakresLiczby2());
            losoweDzialanie = k.getListaDostępnychDziałań().get(random.nextInt(k.getListaDostępnychDziałań().size()));
            System.out.printf("( %d / %d ) Ile wynosi %d %c %d: ", runda, k.getIloscZapytan(), losowaLiczba1, losoweDzialanie, losowaLiczba2);

            wynik = input.nextDouble();

            if (wynik == oblicz())


        }

    }


    public double oblicz(int liczba1, int liczba2, char dzialanie) {
        double wynik = 0.0;
        switch (dzialanie) {
            case '+':
                return liczba1 + liczba2;
            case '*':
                return liczba1 * liczba2;
            case '-':
                return liczba1 - liczba2;
            case '/':
                return liczba1 / liczba2;
            default:
                break;
        }
        return 0;
    }
}
