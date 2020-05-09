package com.company;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Skróty:
        //sout - skrót dzięki któremy napiszemy System.out.println(); - wydrukuj linię w nowej linia
        //psvm - skrót do public static void main
        //TYPY PROSTE - z małej litery
        //TYPY ZŁOŻONE - z dużej litery, new od utworzenia zmiennej w pamięci
        //== służy do porównywania typów prostych
        //liczby pojedyncze znaki warunki logiczne
        //equals słyży do porównywania typów złożonych

        //Zadanie 1
	    System.out.println("Hello World");
	    //Zadanie 2
        System.out.println(1000);
        //Zadanie 3
        System.out.println(100*30000);
        //Zadanie 4
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbę: ");
        int number = scan.nextInt();
        System.out.println("Ostatnia cyfra: " + number % 10);
        //Zadanie 5
        System.out.println("Wpisz liczbe 1: ");
        int liczba1 = scan.nextInt();
        System.out.println("Wpisz liczbe 2: ");
        int liczba2 = scan.nextInt();
        int wynik = liczba1 + liczba2;
        System.out.println("Suma 2 liczb: " + wynik);
        //Zadanie 6
        System.out.println("Wpisz liczbe 1: ");
        float Liczba1 = scan.nextInt();
        System.out.println("Wpisz liczbe 2: ");
        float Liczba2 = scan.nextInt();
        float Wynik = Liczba1 / Liczba2;
        System.out.println("Iloraz 2 liczb: " + Wynik);
        //Zadanie 7
        /*
        System.out.println("Podaj r: ");
        double r = scan.nextInt();
        double pole_K = Math.pow(r,2.0) * Math.PI;
        System.out.println("Pole koła wynosi: " + pole_K);
        */
        Kolo k = new Kolo();
        k.Komunikat();
        k.Pole();
        //zadanie 8
        /* Co z tym kodem jest nie tak?
        System.out.println("Hello World");
        int a = 5;
        int b = 10;
        int c = a*b;
        System.out.println(c) - brakuje średnika
        */
        //zadanie 9
        /* Co z tym kodem jest nie tak?
        int a; - zmienna b nie jest zadeklarowana
        System.out.println("Hello World");
        a = 20;
        b = 100;
        System.out.println(a/b);
        */
        //zadanie 10
        BigInteger wartosc = new BigInteger("12147483647");
        System.out.println("Długa wartość: " + wartosc);
        long numberr = 12147483647L;
        System.out.println("Długa wartość tylu long: " + numberr);
        //zadanie 11
        Random generator = new Random();
        int random;
        random = generator.nextInt(100);
        System.out.println("Losowa wartość od 0 - 100: " + random);
        Random random1 = new Random();
        System.out.println("Losowa wartość od 0 - 100: " + random1.nextInt(100) + 1);
        //zadanie 12
        int tmp;
        System.out.println("Wpisz wartość numer 1: ");
        int w1 = scan.nextInt();
        System.out.println("Wpisz wartość numer 2: ");
        int w2 = scan.nextInt();
        tmp = w1;
        w1 = w2;
        w2 = tmp;
        System.out.println("Zamiana wartość numer 1: " + w1);
        System.out.println("Zamiana wartość numer 2: " + w2);
        //zadanie 13
        System.out.println("Srednia: Wpisz wartość numer 1: ");
        Double W1 = scan.nextDouble();
        System.out.println("Srednia: Wpisz wartość numer 2: ");
        Double W2 = scan.nextDouble();
        System.out.println("Srednia: Wpisz wartość numer 3: ");
        Double W3 = scan.nextDouble();
        Double WYNIK = (W1 + W2 + W3) / 3;
        DecimalFormat dec = new DecimalFormat("#0.00");
        System.out.println("Srednia: " + dec.format(WYNIK));
    }
}
