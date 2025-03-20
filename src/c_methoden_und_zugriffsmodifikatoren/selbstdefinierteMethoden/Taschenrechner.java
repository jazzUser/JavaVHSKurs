package c_methoden_und_zugriffsmodifikatoren.selbstdefinierteMethoden;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Benutzereingabe
        System.out.print("Gib die erste Zahl ein: ");
        double num1 = scanner.nextDouble();

        System.out.print("Gib die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();

        System.out.print("Gib den Operator ein (+, -, *, /): ");
        String operator = scanner.next();

        // Aufrufen der passenden Methode
        double result = 0;
        switch (operator) {
            case "+":
                result = summe(num1, num2);
                break;
            case "-":
                result = differenz(num1, num2);
                break;
            case "*":
                result = produkt(num1, num2);
                break;
            case "/":
                result = quotient(num1, num2);
                break;
            default:
                System.out.println("Ungültiger Operator!");
                scanner.close();
                return;
        }

        // Ergebnis ausgeben
        System.out.println("Ergebnis: " + result);
        scanner.close();
    }

    // Methoden für die Grundrechenarten
    public static double summe(double a, double b) {
        return a + b;
    }

    public static double differenz(double a, double b) {
        return a - b;
    }

    public static double produkt(double a, double b) {
        return a * b;
    }

    public static double quotient(double a, double b) {
        if (b == 0) {
            System.out.println("Fehler: Division durch Null!");
            return 0;
        }
        return a / b;
    }
    }

