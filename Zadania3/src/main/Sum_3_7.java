package main;

public class Sum_3_7 {
    public static void main(String[] arg){

        System.out.println("Program, który sumuje liczby całkowite od 1 do 100.");

        System.out.println("Petla for (Zad. 3.7)");
        int sum = 0;
        for (int x = 1; x <= 100; x ++){
            sum += x;
        }
        System.out.println("Suma liczb od 1 do 100 to : " + sum);

        System.out.println("Pętla do ... while (Zad. 3.8)");
        int x = 1;
        sum = 0;
        do {
            sum += x;
            x ++;
        }while (x <= 100);
        System.out.println("Suma liczb od 1 do 100 to : " + sum);

        System.out.println("Pętla do while (Zad. 3.9)");
        x = 1;
        sum = 0;
        while (x <=100){
            sum += x;
            x ++;
        }
        System.out.println("Suma liczb od 1 do 100 to : " + sum);

    }
}
