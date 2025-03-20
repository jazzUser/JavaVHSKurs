package b_kontrollstrukturen;

import java.util.Scanner;

public class SwitchCaseBeispiel {
    public static void main(String[] args) {
        // Erstellt ein neues Scanner-Objekt und ermöglicht eine Eingabe im Terminal
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Bewertung ein (sehr gut, gut, befriedigend, ausreichend): ");

        // Liest die Benutzereingabe als String ein
        String bewertung = scanner.nextLine();

        // Variable zur Speicherung der entsprechenden Note
        int note;

        // Switch-Anweisung zur Umwandlung der Bewertung in eine Note
        switch (bewertung.toLowerCase()) { // Umwandlung in Kleinbuchstaben für eine einheitliche Erkennung
            case "sehr gut":
                note = 1;
                break;
            case "gut":
                note = 2;
                break;
            case "befriedigend":
                note = 3;
                break;
            case "ausreichend":
                note = 4;
                break;
            default:
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine gültige Bewertung ein.");
                scanner.close();
                return; // Beendet das Programm bei einer ungültigen Eingabe
        }

        // Gibt die entsprechende Note aus
        System.out.println("Die entsprechende Note ist: " + note);

        // Scanner schließen
        scanner.close();
    }
}
