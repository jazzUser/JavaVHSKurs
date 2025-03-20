package a_grundlagen;

public class DeklarationUndInitialisierung {
    public static void main(String[] args) {

        // Deklaration einer Variablen "a"
        int a;

        // Initialisierung der Variablen "a" mit dem Wert 1
        a = 1;

        System.out.println("A davor: " + a);

        // Deklaration und direkte Initialisierung einer Variablen "b"
        int b = 2;

        System.out.println("B davor: " + b);

        // Neue Wertzuweisung: "a" erhält den Wert von "b"
        a = b;

        // Neue Wertzuweisung: "b" erhält den Wert 5
        b = 5;

        System.out.println("A danach: " + a);
        System.out.println("B danach: " + b);

        // Ausgabe mit print(), println() und printf()

        int x = 10;
        int y = 20;

        // print()
        System.out.print("Wert von x: " + x);  // Gibt den Wert von "x" aus, aber *ohne Zeilenumbruch*
        System.out.print(" und Wert von y: " + y);  // Fügt den Wert von "y" in derselben Zeile hinzu

        // println()
        System.out.println();  // Fügt einen Zeilenumbruch hinzu, um die nächste Ausgabe zu trennen

        System.out.println("Wert von x: " + x);  // Gibt den Wert von "x" aus und setzt einen Zeilenumbruch
        System.out.println("Wert von y: " + y);  // Gibt den Wert von "y" aus und setzt ebenfalls einen Zeilenumbruch

        // printf() – Formatierte Ausgabe
        int alter = 25;
        double preis = 19.99;

        System.out.printf("Ich bin %d Jahre alt und der Preis ist %.2f Euro.\n", alter, preis);
        // Gibt einen formatierten String aus:
        // %d = Ganzzahl (int)
        // %.2f = Fließkommazahl mit 2 Nachkommastellen (double)
        // \n sorgt für einen Zeilenumbruch

    }
}
