package b_kontrollstrukturen;

public class WhileSchleife {
    public static void main(String[] args) {
        int i = 1;

        // Eine do-while-Schleife, die von 1 bis 5 zählt
        do {
            System.out.println("Durchlauf: " + i);
            i++;  // Erhöht i nach jedem Durchlauf
        } while (i <= 5);  // Bedingung, die nach jedem Durchlauf überprüft wird

        // Eine while-do schleife

        int x = 1;

        // Eine while-Schleife, die von 1 bis 5 zählt
        while (x <= 5) {
            System.out.println("Durchlauf: " + x);
            x++;  // Erhöht i nach jedem Durchlauf
        }

        int y = 6; // Startwert größer als 5

        while (y <= 5) {

            System.out.println("Durchlauf: " + y);
            y++;  // Dieser Block wird niemals ausgeführt
        }
    }
}
