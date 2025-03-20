package c_methoden_und_zugriffsmodifikatoren.klassenMethoden;

import java.util.Arrays;

public class ArrayMethoden {
    public static void main(String[] args) {
        // Ein Array von Zahlen
        int[] zahlen = {5, 2, 8, 1, 3};

        // Länge des Arrays
        System.out.println("Länge des Arrays: " + zahlen.length);

        // Ein bestimmtes Element abrufen
        System.out.println("Element an Index 2: " + zahlen[2]);

        // Array sortieren
        Arrays.sort(zahlen);
        System.out.println("Sortiertes Array: " + Arrays.toString(zahlen));

        // Kopie eines Arrays erstellen
        int[] zahlenKopie = Arrays.copyOf(zahlen, zahlen.length);
        System.out.println("Kopie des Arrays: " + Arrays.toString(zahlenKopie));
    }
}
