package main;

public class Integer_3_4 {
    public static void main(String[] arg){

        System.out.println("Program, który wyświetla liczby całkowite od 1 do 20.");
        System.out.println("Pętla for (Zad. 3.4)");
        for (int x = 1; x <= 20; x ++){
            if (x < 20)
                System.out.print(x + ", ");
            else
            System.out.print(x + ".");
        }
        System.out.println("\nPętla do ... while (Zad. 3.5)");
        int x = 1;
        do {
            if (x < 20)
                System.out.print(x + ", ");
            else
                System.out.print(x + ".");
        x ++;
        }while (x <= 20);


        System.out.println("\nPętla while (Zad. 3.6)");
        x = 1;
        while (x <= 20){
            if (x < 20)
                System.out.print(x + ", ");
            else
                System.out.print(x + ".");
        x ++;
        }

    }
}
