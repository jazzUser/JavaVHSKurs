package e_kleine_projekte;

import java.util.Scanner;

public class GetraenkeAutomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getränke & Preise
        String[] getraenke = {"Cola", "Fanta", "Sprite", "Wasser", "Eistee"};
        double[] preise = {2.50, 2.30, 2.20, 1.50, 2.00};

        System.out.println(getraenke.length);

        // Menü anzeigen
        System.out.println("📌 Getränkeautomat");
        for (int i = 0; i < getraenke.length; i++) {
            System.out.printf("%d - %s (€%.2f)\n", i + 1, getraenke[i], preise[i]);
        }

        // Getränkeauswahl
        int auswahl;
        do {
            System.out.print("\n🔢 Wähle ein Getränk (1-5): ");
            while (!scanner.hasNextInt()) { // Prüft, ob eine Zahl eingegeben wurde
                System.out.println("❌ Bitte eine gültige Zahl eingeben!");
                scanner.next(); // Falsche Eingabe verwerfen
            }
            auswahl = scanner.nextInt();
        } while (auswahl < 1 || auswahl > 5);

        // Preis des gewählten Getränks
        double preis = preise[auswahl - 1];
        System.out.printf("💰 %s kostet: €%.2f\n", getraenke[auswahl - 1], preis);

        // Geld einwerfen
        double eingezahlt = 0.0;
        while (eingezahlt < preis) {
            System.out.printf("🪙 Bitte Geld einwerfen (noch fehlen: €%.2f): ", (preis - eingezahlt));
            while (!scanner.hasNextDouble()) { // Prüft, ob eine gültige Zahl eingegeben wurde
                System.out.println("❌ Ungültige Eingabe! Bitte eine Zahl eingeben.");
                scanner.next(); // Falsche Eingabe verwerfen
            }
            double betrag = scanner.nextDouble();

            if (betrag <= 0) {
                System.out.println("❌ Ungültiger Betrag! Bitte eine positive Zahl eingeben.");
                continue; // Springt zurück zur Eingabeaufforderung
            }

            eingezahlt += betrag; // Geld addieren
        }

        // Getränk ausgeben
        System.out.printf("🥤 Hier ist dein %s! 🍹\n", getraenke[auswahl - 1]);

        // Wechselgeld berechnen
        double wechselgeld = eingezahlt - preis;
        if (wechselgeld > 0) {
            System.out.printf("💰 Dein Wechselgeld: €%.2f\n", wechselgeld);
        }

        System.out.println("✅ Vielen Dank! Genieße dein Getränk.");
        scanner.close(); // Scanner schließen
    }
}