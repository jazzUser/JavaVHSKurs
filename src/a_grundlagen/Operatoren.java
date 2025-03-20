package a_grundlagen;

public class Operatoren {
    public static void main(String[] args) {
        //Arithmetische Operatoren +, -, *, /, %
        int z1 = 3;
        int z2 = 2;

        System.out.println(z1 * z2);
        System.out.println(z1%2);

        //Post- und Präfix-Operatoren 	++i, --i, i++, i--
        int i = 5;
        System.out.println("Postfix-Inkrement: " + (i++)); // 5, danach a = 6
        System.out.println("Wert von a nach Inkrement: " + i); // 6*/
        System.out.println("Prefix-Inkerement: " + ++i);

        //Vergleichsoperatoren ==, !=, >, <, >=, <=
        int x = 10, y = 20;
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x > y);  // false
        System.out.println(x < y);  // true
        System.out.println(x >= y); // false
        System.out.println(x <= y);

        //Boolesche Operatoren &&, || ,
        boolean a = true, b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false

        boolean zero = false, one = true;
        System.out.println(zero && one); // false
        System.out.println(zero || one); // true
        System.out.println(!zero); // false

        //Zuweisungsoperatoren 	=, +=, -=, *=, /=, %=
        int xx = 10;
        xx += 5;  // x = x + 5 -> 15
        xx -= 2;  // x = x - 2 -> 13
        xx *= 3;  // x = x * 3 -> 39
        xx /= 3;  // x = x / 3 -> 13
        xx %= 4;  // x = x % 4 -> 1
        System.out.println("Endwert von x: " + xx);


    }
}
