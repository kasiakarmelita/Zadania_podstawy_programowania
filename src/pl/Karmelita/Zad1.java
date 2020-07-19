package pl.Karmelita;

public class Zad1 {
    public static void zad1() {
        float srednica=ScannerUtils.getFloatFromScanner("Podaj średnicę okręgu");
        float obwod = 3.14f * srednica;
        System.out.println("Obwod okręgu wynosi (pi=3,14): " + obwod);
        double obwod2 = srednica * Math.PI;
        System.out.println("Obwod okręgu wynosi (pi=Math.PI): " + obwod2);

    }
}