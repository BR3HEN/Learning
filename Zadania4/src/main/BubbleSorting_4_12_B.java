package main;

import java.util.Random;

public class BubbleSorting_4_12_B {
    public static void main(String[] arg){

        Random r = new Random();
        int[] tab = {r.nextInt(500), r.nextInt(500), r.nextInt(500),
                r.nextInt(500), r.nextInt(500), r.nextInt(500)};

        for (int x = 0; x < tab.length; x++){
            if (x <=4) System.out.print(tab[x] + ", ");
            else System.out.print(tab[x] + ".");
        }
        int a = 1;
        int y, b;
        while (a <= tab.length-1){
            b = tab.length-1;
            while (b >= a){
                if (tab[b-1] > tab[b]){
                    y = tab[b-1];
                    tab[b-1] = tab[b];
                    tab[b] = y;
                }
                b--;
            }
            a++;
        }
        System.out.println("\n");
        for (int x = 0; x < tab.length; x++){
            if (x <=4) System.out.print(tab[x] + ", ");
            else System.out.print(tab[x] + ".");
        }


    }
}
