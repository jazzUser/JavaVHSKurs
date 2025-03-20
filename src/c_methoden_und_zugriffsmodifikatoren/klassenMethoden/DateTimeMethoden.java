package c_methoden_und_zugriffsmodifikatoren.klassenMethoden;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeMethoden {
    public static void main(String[] args) {
        // Aktuelles Datum abrufen
        LocalDate datum = LocalDate.now();
        System.out.println("Heutiges Datum: " + datum);

        // Aktuelle Uhrzeit abrufen
        LocalTime uhrzeit = LocalTime.now();
        System.out.println("Aktuelle Uhrzeit: " + uhrzeit);

        // Datum und Uhrzeit zusammen
        LocalDateTime datumUhrzeit = LocalDateTime.now();
        System.out.println("Datum und Uhrzeit: " + datumUhrzeit);

        // Ein bestimmtes Datum erstellen
        LocalDate meinGeburtstag = LocalDate.of(2000, 5, 15);
        System.out.println("Mein Geburtstag: " + meinGeburtstag);
    }
}
