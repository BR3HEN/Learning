package main;

import java.util.Scanner;

public class MathVariable_1_7 {
    public static void main(String [] arg){

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę: ");
            float a = sc.nextFloat();
            System.out.println("Podaj drugą liczbę: ");
            float b = sc.nextFloat();

            System.out.printf("Suma wynosi: %.2f\n", a + b);
            System.out.printf("Różnica wynosi: %.2f\n", a - b, "\n");
            System.out.printf("Iloczyn wynosi: %.2f\n", a * b, "\n");
            System.out.printf("Iloraz wynosi: %.2f\n", a / b, "\n");
        }
        catch (Exception C){
            System.out.println("Nie podałeś liczby.");
            main(null);
        }

    }
}
