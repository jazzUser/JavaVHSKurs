package a_grundlagen;

import java.util.Arrays;

public class NichtPrimitiveDatentypen {
    public static void main(String[] args) {
        /*
        Nicht-primitive Datentypen in Java sind Objekte,
        die von der Klasse "Object" erben und komplexe Datenstrukturen darstellen.
        Sie werden auch als Referenzdatentypen bezeichnet.
        */

        /* Beispiele für nicht-primitive Datentypen:
           - Strings
           - Arrays
           - Klassen
           - Interfaces
           - Wrapper-Klassen
           - Collections
           - Enums
        */

        String zeichenkette = "zeichenkette";
        String wort = "Ich bin eine";
        System.out.println(wort + " " + zeichenkette);

        // Arrays (Arrays sind Listen, die für verschiedene Datentypen verwendet werden können.)
        // Ein Array beginnt immer bei Index 0 und geht bis zur Anzahl der Elemente - 1.
        // Das bedeutet, dass das erste Element im Array die Position 0 hat
        // und das letzte Element die Position n-1.

        int[] zahlen = {1, 2, 3, 4, 5};
        System.out.println(zahlen[0]); // Gibt die Zahl 1 aus
        System.out.println(zahlen[2]); // Gibt die Zahl 3 aus
        System.out.println(zahlen[4]); // Gibt die Zahl 5 aus

        String[] namen = {"Anna", "Max", "Tom"};
        System.out.println(namen[2]); // Gibt den Namen "Tom" aus

        System.out.println("Funktioniert nicht: " + zahlen);
        System.out.println("Funktioniert nicht: " + namen);
        // Die obige Ausgabe funktioniert nicht wie erwartet, weil:
        // Statt der tatsächlichen Elemente gibt Java die Speicheradresse des Arrays aus.

        // Das Array muss mit toString() in eine lesbare Form umgewandelt werden:
        System.out.println(Arrays.toString(zahlen));
        System.out.println(Arrays.toString(namen));

        // Die Länge eines Arrays kann mit der length-Eigenschaft ermittelt werden
        int laenge = namen.length;
        System.out.println("Länge des Arrays: " + laenge);

        // Das letzte Element eines Arrays kann mit "length - 1" abgerufen werden
        String letzterName = namen[laenge - 1];

        System.out.println(letzterName);
    }
}
