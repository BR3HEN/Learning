package main;

public class ForEquation_3_1 {
    public static void main(String[] arg){
        System.out.println("Program liczy równanie y = 3x dla x'a liczby od 0 do 10");

        System.out.println("W pętli for");
        for (int x = 0; x <= 10; x++){
            System.out.print("x = " + x);
            int y = 3 * x;
            System.out.println(" y = " + y);
        }

        System.out.println("W pętli do ... while (Zad 3.2)");
        int x = 0;
        do {
            System.out.print("x = " + x);
            int y = 3 * x;
            System.out.println(" y = " + y);
            x++;
        } while (x < 11);

        System.out.println("W pętli while zad 3.3");
        x = 0;
        while (x <= 10){
            System.out.print("x = " + x);
            int y = 3 * x;
            System.out.println(" y = " + y);
            x++;
        }

    }
}
