package main;

public class Matrix2While_4_5 {
    public static void main(String[] arg){

        System.out.println("Program wyświetla macierz w której liczby idące po przekątnej to 1. (Zad. 4.5)");
        int[][] matrix = new int[10][10];
        int lin;
        int col = 0;
        int a = matrix.length - 1;
        while (col < matrix.length){
            lin = 0;
            while (lin < matrix.length){
                if (lin == a) matrix[col][lin] = 1;
                else matrix[col][lin] = 0;
                lin++;
            }
            a--;
            col++;
        }
        int sum = 0;
        for(col = 0; col<matrix.length; col++){
            for (lin = 0; lin<matrix.length; lin++){
                System.out.print(matrix[col][lin] + "\t");
                sum += matrix[col][lin];
            }
            System.out.println();
        }
        System.out.println("Suma wartości indeksów macierzy to: " + sum);
        System.out.println();
        System.out.println("Program wyświetla macierz w której liczby idące po przekątnej od 0 do 9. (Zad. 4.6)");
        int[][] matrix2 = new int[10][10];
        col = 0;
        a = matrix2.length - 1;
        while (col < matrix2.length){
            lin = 0;
            while (lin < matrix2.length){
                if (lin == a) matrix2[col][lin] = col;
                else matrix2[col][lin] = 0;
                lin++;
            }
            a--;
            col++;
        }
        sum = 0;
        for(col = 0; col<matrix2.length; col++){
            for (lin = 0; lin<matrix2.length; lin++){
                System.out.print(matrix2[col][lin] + "\t");
                sum += matrix2[col][lin];
            }
            System.out.println();

        }
        System.out.println("Suma wartości indeksów macierzy to: " + sum);


    }
}
