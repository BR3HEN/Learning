package main;

import java.util.Scanner;

public class QuadraticEquationSwitch_2_3 {
    public static void main(String[] arg){

        System.out.println("Program oblicza pierwiastki równania kwadratowego.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Podaj wartość a");
            double a = sc.nextDouble();
            while (a == 0) {
                System.out.println("Niedozwolona wartość współczynnika a. Podaj liczbę ponownie.");
                a = sc.nextDouble();
            }
            System.out.println("Podaj wartość b");
            double b = sc.nextDouble();
            System.out.println("Podaj wartość c");
            double c = sc.nextDouble();
            double delta = (b * b) - (4 * a * c);
            char pierwiastki = 0;
            if (delta > 0) pierwiastki = 2;
            if (delta == 0) pierwiastki = 1;
            if (delta < 0) pierwiastki = 0;

            switch (pierwiastki) {
                case 0:
                    System.out.println("Brak pierwiastków.");
                    break;
                case 1: {
                    double x3 = -b / 2 * a;
                    System.out.println("Dla a = " + a + ", b = " + b + ", c = " + c);
                    System.out.printf("x3 = %.2d", x3);
                }
                break;
                case 2: {
                    double x1 = (-b - Math.sqrt(delta)) / 2 * a;
                    double x2 = (-b + Math.sqrt(delta)) / 2 * a;
                    System.out.println("Dla a = " + a + ", b = " + b + ", c = " + c);
                    System.out.printf("x1 = %.2f", x1);
                    System.out.printf("\nx2 = %.2f", x2);
                }
                break;

            }
        }
        catch (Exception B){
            System.out.println("Podałeś błędną wartość, podaj liczbę.");
            main(null);
        }


    }
}
