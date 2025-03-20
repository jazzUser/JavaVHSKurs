package a_grundlagen;

public class PrimitiveDatentypen {
    public static void main(String[] args) {
        /*
        Ganzzahlige Datentypen:
        - byte   (-128 bis 127)
        - short  (-32.768 bis 32.767)
        - int    (-2.147.483.648 bis 2.147.483.647)
        - long   (-2^63 bis 2^63 - 1)
        */

        // Gültige Zuweisung, da der Wert im gültigen Bereich liegt
        byte zahl1 = 127;

        // Kompilierungsfehler: Der Wert 128 liegt außerhalb des gültigen Bereichs für byte (-128 bis 127)
        // byte zahl2 = 128;

        /*
        Fließkommazahlen:
        - float (ca. 6-7 Dezimalstellen Genauigkeit)
        - double (ca. 15-16 Dezimalstellen Genauigkeit)
        */

        /*
        Zeichen (Character):
        - char (Wertebereich: 0 bis 65.535, speichert ein einzelnes Zeichen)
        */
        char zahl = 64;  // Nummer 64 steht für das Symbol '@' in der ASCII-Tabelle
        char buchstabe = '@';   // Speichert das Zeichen '@'

        System.out.println(zahl);      // Gibt '@' aus
        System.out.println(buchstabe); // Gibt 'A' aus

        // Wahrheitswerte (boolean-Typ)
        boolean wahr = true;
        boolean falsch = false;

        System.out.println(wahr);   // Gibt "true" aus
        System.out.println(falsch); // Gibt "false" aus
    }
}
