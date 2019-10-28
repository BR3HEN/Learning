package main;

public class Lesson02 {
    public static void main(String[] arg) {

        int tab01[] = new int[5];
        tab01[0] = 1;
        tab01[1] = 2;
        tab01[2] = 3;
        tab01[3] = 4;
        tab01[4] = 5;

        int tab02[] = {6, 7, 8, 9, 0};

        char tab03[] = new char[5];
        tab03[0] = 'd';

        char tab04[] = {'a', 'b', 'c', 'd', 'e'};

        String tab05[] = new String[5];
        String tab06[] = {"Jeden", "Dwa", "Trzy", "Cztery", "Piec"};

        for (int x = 0; x < tab01.length; x++) {
            //W pętli for tworzymy: nową zmienną x i nadajemy jej wartość początkową, najlepiej nr pierwszy z indeksu
            //Nadajemy jej warunek, że ta zmienna musi być mniejsza od liczby indeksów w danej tablicy
            //To ".lenght" odpowiada za ograniczenie do końca indeksów tablicy
            //x++ za każdym razem do wartości x dodaje +1

            System.out.println(x + " : " + tab01[x]);
        }
        //Ulepszona pętla for (Enhanced for)

        for (int enhancedFor: tab01){
            System.out.println(enhancedFor);
        }


    }


}
