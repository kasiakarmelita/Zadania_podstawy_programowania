package pl.Karmelita;

import java.util.Scanner;

public class ScannerUtils {
    public static final Scanner scanner = new Scanner(System.in);

    public static int getIntFromScanner(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public static String getStringFromScanner(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public static float getFloatFromScanner(String message){
        System.out.println(message);
        return scanner.nextFloat();
    }

}
