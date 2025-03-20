public class StringMethoden {
    public static void main(String[] args) {

        String text = "Java";
        System.out.println(text.length());

        String text1 = "Java";
        System.out.println(text1.charAt(1));

        String text2 = "Hallo, Java!";
        System.out.println(text2.substring(7, 11));

        String text3 = "Java";
        System.out.println(text3.toUpperCase()); // "JAVA"
        System.out.println(text3.toLowerCase()); // "java"

        String text4 = "Ich liebe Python!";
        System.out.println(text4.replace("Python", "Java")); // "Ich liebe Java!"

        String text5 = "Ich liebe Python!";
        System.out.println(text5.replace("Python", "Java")); // "Ich liebe Java!"

        String text6 = "Hallo, Java!";
        System.out.println(text6.contains("Java"));

        String leer7 = "";
        System.out.println(leer7.isEmpty()); // true
        System.out.println(leer7.isBlank()); // true

        String space = "  ";
        System.out.println(space.isEmpty()); // false
        System.out.println(space.isBlank()); // true

        String datei = "dokument.pdf";
        System.out.println(datei.endsWith(".pdf")); // true
        System.out.println(datei.startsWith("dok")); // true

        String csv = "Apfel,Banane,Kirsche";
        String[] obst = csv.split(",");

        for (String frucht : obst) {
            System.out.println(frucht);
        }

        String[] woerter = {"Ich", "liebe", "Java"};
        String satz = String.join(" ", woerter);
        System.out.println(satz); // "Ich liebe Java"

        StringBuilder sb = new StringBuilder("Hallo");
        sb.append(", Java!"); // Text anhängen
        System.out.println(sb); // "Hallo, Java!"

    }
}
