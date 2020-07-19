package pl.Karmelita;

import java.util.Scanner;

public class Zad11 {
    public static void zad11() {


       String napis = ScannerUtils.getStringFromScanner("Podaj słowo");

        int dlugosc = 0;
        String napis2 = "Nie podano tekstu1";


        while (!napis.equals("Starczy")) {
            if (napis.isBlank()) {
                System.out.println("Nie podano tekstu2");//Sprawdza czy nie wpisano pustego napisu, na scanner.next nie działa, musi być nextline)
            }
            if (dlugosc < napis.length()) {
                dlugosc = napis.length();
                napis2 = napis;
            }
            napis = ScannerUtils.getStringFromScanner("Podaj kolejne słowo");
        }
        System.out.println(napis2);
    }
}

