package pl.Karmelita;


public class Zad15 {


    private Zad15Number[] getNumbers() {

        Zad15Number[] numbers = new Zad15Number[10];

        for (int i = 0; i < numbers.length; i++) {

            int value = ScannerUtils.getIntFromScanner("Podaj liczbę");
            boolean find = false;
            for (Zad15Number number : numbers) {
                if (number != null && value == number.getValue()) {
                    number.setCounter(number.getCounter() + 1);
                    find = true;
                }


            }


            if (!find) {
                numbers[i] = new Zad15Number(value, +1);
            }


        }
        return numbers;

    }


    private void printNumbers(Zad15Number[] numbers) {

        for (Zad15Number number : numbers) {
            if (number != null && number.getCounter() > 1) {
                System.out.println(number.getValue());
            }
        }

    }

    public void run() {
        printNumbers(getNumbers());
    }

}
