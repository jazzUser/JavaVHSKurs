package b_kontrollstrukturen;

public class ForSchleife {
    public static void main(String[] args) {
        // Die for-Schleife wird ausgeführt, solange "i" kleiner oder gleich 5 ist.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Durchlauf 1: " + i);
        }

        // Die for-Schleife wird ausgeführt, solange "i" kleiner als 5 ist.
        for (int i = 1; i < 5; i++) {
            System.out.println("Durchlauf 2: " + i);
        }

        // Eine for-Schleife, die von 5 bis 1 herunterzählt.
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // Summieren von Zahlen

        int summe = 0;

        // Eine for-Schleife, die die Zahlen von 1 bis 100 aufsummiert
        // wie wir die Laufvariable nennen (z. B. i, x oder eine andere Bezeichnung) bleibt uns überlassen.
        // "i" ist eine weit verbreitete Konvention und steht für "Index" oder "Iterator".
        for (int x = 1; x <= 100; x++) {
            summe += x; // Addiert den Wert von x zur Summe
        }

        System.out.println("Die Summe der Zahlen von 1 bis 100 ist: " + summe);

        // Ein Array mit einigen Zahlen
        int[] zahlen = {5, 10, 15, 20, 25};

        // Eine for-Schleife, um das Array zu durchlaufen und die Werte auszugeben
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("Element an Index " + i + ": " + zahlen[i]);
        }

        // Ein Array mit einigen Namen
        String[] namen = {"Alice", "Bob", "Charlie", "Diana"};

        // Eine for-Schleife, um das Array zu durchlaufen und die Namen auszugeben
        for (int i = 0; i < namen.length; i++) {
            System.out.println("Name an Index " + i + ": " + namen[i]);
        }
    }
}
