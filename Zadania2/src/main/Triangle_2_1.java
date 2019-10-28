package main;

import java.util.Scanner;


public class Triangle_2_1 {

    public static void main(String[] args) {
        System.out.println("Podaj długości boków w celu sprawdzenia czy to trojkat prostokątny.");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Podaj długość najkrótszego boku");
            double a = sc.nextDouble();
            System.out.println("Podaj długość przyprostokątnej krótkiego boku");
            double b = sc.nextDouble();
            System.out.println("Podaj długość najdłuższego boku");
            double c = sc.nextDouble();

            if (a > 0 && b > 0 && c > 0)
                if ((a*a+b*b) == c*c)
                    System.out.println("To jest trójkąt prostokatny");
                else
                    System.out.println("To nie jest trójkąt prostokątny");
            else {
                System.out.println("Podałeś wartość ujemną");
                main(null);
            }
        }
        catch (Exception A){
            System.out.println("Nie podałeś liczb.");
            main(null);
        }

    }
}