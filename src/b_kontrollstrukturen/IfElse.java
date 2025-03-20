package b_kontrollstrukturen;

public class IfElse {
    public static void main(String[] args) {
        int alter = 20;

        // Einfache if-else-Anweisung
        if (alter >= 18) {
            System.out.println("Volljährig");
        } else {
            System.out.println("Minderjährig");
        }

        // Ternärer Operator (verkürzte if-else-Anweisung)
        // Syntax: Bedingung ? Wert wenn true : Wert wenn false
        String ergebnis = (alter >= 18) ? "Volljährig" : "Minderjährig";
        System.out.println(ergebnis); // Gibt "Volljährig" aus

        // Weitere Beispiele

        boolean hasTicket = true;
        boolean isTrainOnTime = false;

        // Überprüfung von zwei Bedingungen mit "&&" (UND)
        if (hasTicket && isTrainOnTime) {
            System.out.println("Ich kann pünktlich fahren!");
        } else {
            System.out.println("Ich habe ein Problem...");
        }

        boolean wahr = true;

        // Wenn die Bedingung "true" ist, wird dieser Code ausgeführt.
        if (wahr) {
            System.out.println("Wenn wahr, wird dieser Teil des Codes ausgeführt.");
        }

        // Mehrere if-else-Anweisungen (else-if-Kette)
        if (alter < 13) {
            System.out.println("Du bist ein Kind.");
        } else if (alter >= 13 && alter < 20) {
            System.out.println("Du bist ein Teenager.");
        } else if (alter >= 20 && alter < 60) {
            System.out.println("Du bist ein Erwachsener.");
        } else {
            System.out.println("Du bist ein Senior.");
        }

        // Verschachtelte if-else-Anweisungen
        int punktzahl = 75;

        if (punktzahl >= 50) {
            System.out.println("Du hast bestanden!");

            if (punktzahl >= 80) {
                System.out.println("Sehr gut!");
            } else if (punktzahl >= 65) {
                System.out.println("Gut gemacht!");
            } else {
                System.out.println("Du hast bestanden, aber es gibt Raum für Verbesserungen.");
            }
        } else {
            System.out.println("Du hast nicht bestanden.");
        }
    }
}
