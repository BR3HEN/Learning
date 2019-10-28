package main;

public class SumEvenNumber_3_10 {
    public static void main(String[] arg){

        System.out.println("Program, który sumuje liczby parzyste od 1 do 100.");

        System.out.println("Pętla for (Zad. 3.10)");
        int sum = 0;
        for (int x = 1; x <= 100; x++){
            if (x %2 == 0)
                sum += x;
        }
        System.out.println("Wynik sumy liczb parzystych od 1 do 100 to : " + sum);

        System.out.println("Pętla do ... while (Zad. 3.11)");
        int x = 1;
        sum = 0;
        do {
            if (x %2 == 0)
            sum += x;
            x ++;
        } while (x <= 100);
        System.out.println("Wynik sumy liczb parzystych od 1 do 100 to : " + sum);

        System.out.println("Pętla while (Zad. 3.12)");
        x = 1;
        sum = 0;
        while (x <= 100){
            if (x %2 == 0)
            sum += x;
            x ++;
        }
        System.out.println("Wynik sumy liczb parzystych od 1 do 100 to : " + sum);
    }
}
