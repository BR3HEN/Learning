package main;

public class MultiplicationTable_3_19 {
    public static void main(String[] arg){

        System.out.println("Program wyświetlający tabliczkę mnożenia.");

        System.out.println("Pętla for (Zad. 3.19)");
        for (int wiersz = 1; wiersz <= 10; wiersz++){
            for (int kolumna = 1; kolumna <=10; kolumna++){//w pętli for automatycznie po wykonaniu drugiej pętli, wartość zmiennej kolumna resetuje się
                System.out.print(wiersz  * kolumna + "\t");
            }
            System.out.println();
        }

        System.out.println("\nPętla do ... while (Zad. 3.20)");
        int wiersz = 1;
        int kolumna = 1;
        do {
            kolumna = 1;
            do {
                System.out.print(wiersz * kolumna + "\t");
                kolumna++;//przed drugą pętlą do ... while należy przypisać wartość początkową zmiennej gdyż po wykonaniu drugiej pętli jej wartość będzie wynosiła 11
                //należy ją zresetować w pierwszej pętli.
            }while (kolumna <= 10);
            System.out.println();
            wiersz++;
        }while (wiersz <= 10);

        System.out.println("\nPętla while (Zad. 3.21)");
        wiersz = 1;
        kolumna = 1;
        while(kolumna <= 10){
            wiersz = 1;//podobnie jak w pętli do ... while, należy zresetować tę zmienną
            while (wiersz <= 10){
                System.out.print(wiersz * kolumna + "\t");
                wiersz++;
            }
            System.out.println();
            kolumna++;
        }

    }
}
