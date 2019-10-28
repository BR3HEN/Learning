package main;

import java.util.Scanner;

public class VolumeOfTheBall_1_3 {
    public static void main (String[] arg){

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Podaj promień kuli.");
            double r = in.nextDouble();
            System.out.printf("Objętość koła wynosi = %.2f", 4 * (Math.PI * (Math.pow(r, 3))) / 3);
        }
        catch (Exception B){
            System.out.println("Nie podałeś liczby.");
            main(null);
        }
    }
}
