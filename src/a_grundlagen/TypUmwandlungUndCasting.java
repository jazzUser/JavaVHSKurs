package a_grundlagen;

public class TypUmwandlungUndCasting {
    public static void main(String[] args) {

        // Von String zu Zahl (Parsing)

        String eingabe = "34";
        int zahl = Integer.parseInt(eingabe); // Wandelt den String "34" in die Ganzzahl 34 um

        // Von Zahl zu String (Konvertierung)
        int zahl1 = 34;
        String wort = String.valueOf(zahl1); // Wandelt die Ganzzahl 34 in den String "34" um

        // Implizites und explizites Casting

        // Implizites Casting (Widening)

        // kleinere Datentypen werden automatisch in größere umgewandelt.

        int myInt = 100;
        double myDouble = myInt; // Automatische Umwandlung von int → double
        System.out.println(myDouble); // Gibt 100.0 aus

        // Explizites Casting (Narrowing)
        // Größere Datentypen müssen explizit in kleinere umgewandelt werden.

        double kommaZahl = 9.99;  // Eine Gleitkommazahl (double)

        // Explizites Casting von double zu int (Nachkommastellen gehen verloren!)
        int ganzzahl = (int) kommaZahl;
        System.out.println(ganzzahl); // Gibt 9 aus

        long grosseZahl = 123456789L;  // Eine große Zahl (long)
        int kleinereZahl = (int) grosseZahl;  // Explizites Casting von long zu int

        System.out.println("Originalwert (long): " + grosseZahl);  // Gibt 123456789 aus
        System.out.println("Umgewandelter Wert (int): " + kleinereZahl); // Kann zu Datenverlust führen!

        // Konvertierung eines Strings in eine Ganzzahl
        String zahlString = "123";
        int z1 = Integer.parseInt(zahlString);
        System.out.println(z1 + 10); // Ausgabe: 133 (da 123 als int interpretiert wird)
    }
}
