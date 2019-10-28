package main;

import java.util.Scanner;

public class FindX_2_4 {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Program wyszukuje x'a w równaniu ax + b = c.");

        try {
            System.out.println("Podaj liczbę a : ");
            double a = sc.nextDouble();
            while (a == 0){
                System.out.println("Wartość a nie może być 0, podaj liczbę większą od 0:");
                a = sc.nextDouble();
            }
            System.out.println("Podaj liczbę b : ");
            double b = sc.nextDouble();
            System.out.println("Podaj liczbę c : ");
            double c = sc.nextDouble();
            double x = (c - b) / a;
            System.out.printf("X wynosi : %.2f", x);
        }
        catch (Exception C){
            System.out.println("Nie podałeś liczby tylko inny znak.");
            main(null);
        }

    }
}
