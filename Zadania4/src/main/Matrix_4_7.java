package main;

public class Matrix_4_7 {
    public static void main(String[] arg){
        System.out.println("Program pokazuje w 1 kolumnie wartości od 0 do 9 a w drugiej potęgę tych wartości.");
        int[][] tab = new int[10][10];
        int sum = 0;
        int sum2 = 0;
        for (int col = 0; col < tab.length; col++){
            for (int lin = 0; lin < tab.length; lin++){
                if (lin == 0) tab[col][lin] = col;
                if (lin == 1) tab[col][lin] = col*col;
                System.out.print(tab[col][lin] + "\t");
                if (lin == 0) sum += tab[col][lin];
                if (lin == 1) sum2 += tab[col][lin];
            }
            System.out.println();
        }

        System.out.println("Suma pierwszej lini to: " + sum);
        System.out.println("Suma drugiej lini to: " + sum2);


    }
}
