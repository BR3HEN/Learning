package main;

import java.util.Random;
import java.util.Scanner;

public class GuessNnunmber_2_5 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        try {
            System.out.println("Gra w zgadywanie liczby od 0 do 9, musisz odgadnąć :)!");
            int random = r.nextInt(10);
            System.out.println("Jaka to liczba?");
            int answer = sc.nextInt();
            while (random != answer) {
                System.out.println("Zła odpowiedź, zgaduj dalej!");
                answer = sc.nextInt();
            }
            System.out.println("Udało Ci się odgadnąć, ta liczba to: " + random);
        }
        catch (Exception d){
            System.out.println("Nie podałeś liczby tylko inny znak.");
            main(null);
        }




    }
}
