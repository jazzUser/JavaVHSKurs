package d_objektorientierung;

import c_methoden_und_zugriffsmodifikatoren.selbstdefinierteMethoden.Taschenrechner;

public class Student {

    // Attribute (Eigenschaften des Objekts)
    String name;
    int alter;
    String studiengang;

    // Konstruktor (Erstellt ein Student-Objekt mit bestimmten Werten)
    public Student(String name, int alter, String studiengang) {
        this.name = name;
        this.alter = alter;
        this.studiengang = studiengang;
    }

    // Methode zum Anzeigen der Studentinformationen
    public void zeigeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Studiengang: " + studiengang);
    }

    // Methode, damit der Student das Auto fährt
    public void fahreAuto(Auto auto) {
        System.out.println(name + " fährt ein " + auto.marke + " " + auto.modell + ".");
    }

    public static void main(String[] args) {
        // Erstellen eines Student-Objekts
        Student student1 = new Student("Alice", 21, "Informatik");

        // Erstellen eines Auto-Objekts
        Auto auto1 = new Auto("Toyota", "Corolla", 2020);

        // Aufrufen der Methode
        student1.zeigeInfo();
        auto1.zeigeInfo();
        student1.fahreAuto(auto1);
    }
}