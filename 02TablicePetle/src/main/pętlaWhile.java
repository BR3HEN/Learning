package main;

public class pętlaWhile {
    public static void main(String [] args){

        int [] liczenie = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int x = 0;

        while (x < liczenie.length){
            System.out.println(liczenie[x]);
            x++;
        }

        x = 0;

/*        do {
            System.out.println(liczenie[x]);
            x++;
        } while (x < liczenie.length);
 */
    }
}
