package pl.Karmelita;

public class Main {

    public static void main(String[] args) {
        int zadanie = ScannerUtils.getIntFromScanner("Podaj numer zadania, które chcesz uruchomić");

        switch (zadanie) {
            case 1:
                Zad1.zad1();
                break;
            case 2:
                Zad2.zad2();
                break;
            case 9:
                Zad9.zad9();
                break;
            case 11:
                Zad11.zad11(); //nie pozwala wczytać pierwszego słowa, kolejne już poprawnie (zawsze wykonuje pierwszego if)
                break;
            case 15:
                Zad15 zad15 = new Zad15();
                zad15.run();
                break;
            case 19:
                Zad19.zad19();
                break;

            default:
                System.out.println("Podano błędny numer zadania");

        }
    }
}
