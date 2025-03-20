package c_methoden_und_zugriffsmodifikatoren.selbstdefinierteMethoden;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class MethodenBeispiel {

    // 1. Methode ohne Parameter und ohne Rückgabewert
    static void sagHallo() {
        System.out.println("Hallo, willkommen in Java!");
    }

    // 2. Methode mit einem Parameter
    static void begruessung(String name) {
        System.out.println("Hallo, " + name + "!");
    }

    // 3. Methode mit mehreren Parametern
    static void addiere(int a, int b) {
        int summe = a + b;
        System.out.println("Summe: " + summe);
    }

    // 4. Methode mit Rückgabewert
    static int quadriere(int zahl) {
        return zahl * zahl;
    }

    // 5. Methode mit mehreren Rückgabewerten (Array zurückgeben)
    static int[] minMax(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return new int[]{min, max};
    }

    // 6. Methode mit boolean Rückgabewert
    static boolean istGerade(int zahl) {
        return zahl % 2 == 0;
    }

    // 7. Methode mit void und return zum vorzeitigen Beenden
    static void checkAlter(int alter) {
        if (alter < 18) {
            System.out.println("Zugang verweigert!");
            return;
        }
        System.out.println("Willkommen!");
    }

    public static void main(String[] args) {
        // Aufrufe der Methoden
        sagHallo();

        begruessung("Alice");
        begruessung("Bob");

        addiere(5, 10);
        addiere(20, 30);

        int ergebnis = quadriere(4);
        System.out.println("Das Quadrat von 4 ist: " + ergebnis);

        int[] werte = minMax(10, 25);
        System.out.println("Minimum: " + werte[0]);
        System.out.println("Maximum: " + werte[1]);

        System.out.println("Ist 10 gerade? " + istGerade(10));
        System.out.println("Ist 7 gerade? " + istGerade(7));

        checkAlter(16);
        checkAlter(21);
    }
}

