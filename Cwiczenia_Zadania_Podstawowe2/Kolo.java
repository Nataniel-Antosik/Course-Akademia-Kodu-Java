package com.company;

import java.util.Scanner;

public class Kolo {
    public static void Komunikat(){
        System.out.println("Wpisz wartość r: ");
    }
    public static void Pole() {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextInt();
        double pole_K = Math.pow(r, 2.0) * Math.PI;
        System.out.println("Pole koła wynosi: " + pole_K);
    }
}
