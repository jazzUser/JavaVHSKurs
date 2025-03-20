package d_objektorientierung;

public class Auto {
    String marke;
    String modell;
    int baujahr;

    public Auto(String marke, String modell, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public void zeigeInfo() {
        System.out.println("Auto: " + marke + " " + modell + " (" + baujahr + ")");
    }
}
