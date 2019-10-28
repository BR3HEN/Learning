package main;

import java.util.Random;

public class TheHighestAndLowestRandom_3_16 {
    public static void main(String[] arg){

        System.out.println("Program pokazuje największą i najmniejszą liczbę z 5 wylosowanych oraz ich średnią.");

        Random r = new Random();
        System.out.println("Pętla for (Zad. 3.16)");
        int min = r.nextInt(100);//wylosuj zmienną do która będzie bazową i porównywana do innych
        int max = min;//przypisz jej drugą zmienną o tej samej wartości
        double srednia = min;//wartość startowa zmiennej srednia, aby później prawidłowo obliczyć średnią
        System.out.print("Wylosowane liczby to: \n" + min);//podaj pierwsza losową liczbę
        for (int n = 1; n <= 5-1; n ++){//pętla będzie losować 4 razy bo 1 los już się odbył z 5
            int random = r.nextInt(100);//losuj liczbe
            System.out.print(" " + random);//wypisz te liczbę
            srednia += random;//przypisz ją do zmiennej srednia
            if (min > random) min = random;//jesli zmienna min będzie większa od nowej losowe to zastąp ją bo ma być mniejsza
            if (max < random) max = random;//jeśli zmienna max będzie mniejsza od losowej to zastąp ją bo ma być większa
        }
        srednia = srednia/5.0;
        System.out.println("\nNajmniejsza liczba to: " + min);
        System.out.println("Największa liczba to : " + max);
        System.out.println("średnia z wylosowanych liczb to " + srednia);

        System.out.println("\nPętla do ... while (Zad. 3.17)");
        int min2 = r.nextInt(100);
        int max2 = min2;
        double srednia2 = min2;
        int n = 1;
        System.out.print("Wylosowane liczby to: \n" + min2 + " ");
        do {
            int random2 = r.nextInt(100);
            System.out.print(random2 + " ");
            srednia2 += random2;
            if (min2 > random2) min2 = random2;
            if (max2 < random2) max2 = random2;
            n++;
        }while (n <= 5-1);
        srednia2 = srednia2/5.0;
        System.out.println("\nNajmniejsza liczba to: " + min2);
        System.out.println("Największa liczba to : " + max2);
        System.out.println("średnia z wylosowanych liczb to " + srednia2);

        System.out.println("\nPętla while (Zad. 3.18)");
        int min3 = r.nextInt(100);
        int max3 = min3;
        double srednia3 = min3;
        n = 1;
        System.out.print("Wylosowane liczby to: \n" + min3 + " ");
        while (n<=4){
            int random3 = r.nextInt(100);
            System.out.print(random3 + " ");
            srednia3 += random3;
            if (min3 > random3) min3 = random3;
            if (max2 < random3) max2 = random3;
            n++;
        }
        srednia3 = srednia3/5.0;
        System.out.println("\nNajmniejsza liczba to: " + min3);
        System.out.println("Największa liczba to : " + max3);
        System.out.println("średnia z wylosowanych liczb to " + srednia3);

    }
}
