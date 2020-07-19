package pl.Karmelita;

public class Zad2 {
    public static void zad2() {


        Zad2Person person =new Zad2Person(ScannerUtils.getIntFromScanner("Podaj swój wzrost w cm"), ScannerUtils.getFloatFromScanner("Podaj swoją wagę w kg"));



        float bmi = person.getWaga() / ((person.getWzrost() / 100f) * (person.getWzrost() / 100f));
        System.out.println("BMI wynosi: " + bmi);
        if (bmi < 18.5 || bmi > 24.9) {
            System.out.println("BMI nieoptymalne");
        } else {
            System.out.println("BMI optymalne");
        }


    }

}
