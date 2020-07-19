package pl.Karmelita;

public class Zad9 {
    public static void zad9() {

        int dlugosc = ScannerUtils.getIntFromScanner("Podaj długość fali");
        if (dlugosc <= 0) {
            System.out.println("błędna wartość");
        } else {
            char[][] fala = new char[4][dlugosc];

// uzupełnienie gwiazdek - po 2xfor dla każdego wiersza
            for (int i = 0; i < dlugosc; i = i + 8) {
                fala[0][i] = '*';
            }
            for (int i = 7; i < dlugosc; i = i + 8) {
                fala[0][i] = '*';
            }


            for (int i = 1; i < dlugosc; i = i + 8) {
                fala[1][i] = '*';
            }
            for (int i = 6; i < dlugosc; i = i + 8) {
                fala[1][i] = '*';
            }


            for (int i = 2; i < dlugosc; i = i + 8) {
                fala[2][i] = '*';
            }
            for (int i = 5; i < dlugosc; i = i + 8) {
                fala[2][i] = '*';
            }


            for (int i = 3; i < dlugosc; i = i + 8) {
                fala[3][i] = '*';
            }
            for (int i = 4; i < dlugosc; i = i + 8) {
                fala[3][i] = '*';
            }


            // puste komórki uzupełniane spacjami
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < dlugosc; i++) {
                    if (fala[j][i] != '*') {
                        fala[j][i] = ' ';

                    }

                }
            }

            PrintUtils.printCharBord(fala);

        }

    }
}

