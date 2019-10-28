package main;

import java.util.Scanner;

public class AreaRectangleException_1_8 {
    public static void main(String[] arg) {

        Scanner value = new Scanner(System.in);


        try {
            System.out.println("Podaj długość boku a: ");
            double a = value.nextDouble();
            System.out.println("Podaj długość boku b: ");
            double b = value.nextDouble();
            double area = a * b;
            System.out.println("Pole wynosi : " + area);
        }
        catch (Exception A){
            System.out.println("Nie podałeś liczby.");
            main(null);
        }

        }


    }

