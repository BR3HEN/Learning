package main;

public class SumOddNumber_3_13 {
    public static void main(String[] arg){

        System.out.println("Program, który sumuje liczby nieparzyste od 1 do 100.");

        System.out.println("Pętla for (Zad. 3.13)");
        int sum = 0;
        for (int x = 1; x <= 100; x++){
            if (x %2 != 0)//warunek if spełniony, mają to być liczby po przeciunku różne od 0
                sum += x;
        }
        System.out.println("Wynik sumy liczb nieparzystych od 1 do 100 to : " + sum);

        System.out.println("Pętla do ... while (Zad. 3.14)");
        int x = 1;
        sum = 0;
        do {
            if (!(x %2 == 0))//negacja całego warunku, czyli warunek if da true to zneguje go na false
                sum += x;
            x ++;
        } while (x <= 100);
        System.out.println("Wynik sumy liczb nieparzystych od 1 do 100 to : " + sum);

        System.out.println("Pętla while (Zad. 3.15)");
        x = 1;
        sum = 0;
        while (x <= 100){
            if (x %2 != 0)
                sum += x;
            x ++;
        }
        System.out.println("Wynik sumy liczb nieparzystych od 1 do 100 to : " + sum);

    }
}
