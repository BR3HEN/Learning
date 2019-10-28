package main;

public class Matrix_4_3 {
    public static void main(String[] arg){

        System.out.println("Program wyświetla macierz w której liczby idące po przekątnej to 1 reszta to 0. (Zad. 4.3)");
        int[][] matrix = new int[10][10];
        for(int col = 0; col<matrix.length; col++){
            for (int lin = 0; lin<matrix.length; lin++){
                if (lin == col)
                    matrix[col][lin] = 1;
                else
                    matrix[col][lin] = 0;
            }
        }
        int sum = 0;
        for(int col = 0; col<matrix.length; col++){
            for (int lin = 0; lin<matrix.length; lin++){
                System.out.print(matrix[col][lin] + "\t");
                sum += matrix[col][lin];
            }
            System.out.println();
        }
        System.out.println("Suma wartości indeksów macierzy to: " + sum);

        System.out.println("Program wyświetla macierz w której liczby idące po przekątnej od 0 do 9. (Zad. 4.4)");
        int[][] matrix2 = new int[10][10];
        for(int col = 0; col<matrix2.length; col++){
            for (int lin = 0; lin<matrix2.length; lin++){
                if (lin == col)
                    matrix2[col][lin] = lin;
                else
                    matrix2[col][lin] = 0;
            }
        }
        System.out.println();
        sum = 0;
        for(int col = 0; col<matrix2.length; col++){
            for (int lin = 0; lin<matrix2.length; lin++){
                System.out.print(matrix2[col][lin] + "\t");
                sum += matrix2[col][lin];
            }
            System.out.println();
        }
        System.out.println("Suma wartości indeksów macierzy to: " + sum);
    }
}
