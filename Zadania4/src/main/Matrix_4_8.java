package main;

public class Matrix_4_8 {
    public static void main(String[] arg) {

        System.out.println("Dane są dwie tablice A i B, program przepisuje wartość z A do B.");

        int[][] a = new int[10][10];
        int[][] b = new int[10][10];

        for (int lin = 0; lin < a.length; lin++) {
            for (int col = 0; col < a.length; col++) {
                a[lin][col] = col;
            }
        }

        System.out.println("Macierz A");
        for (int lin = 0; lin < a.length; lin++) {
            for (int col = 0; col < a.length; col++) {
                System.out.print(a[lin][col] + "\t");
            }
            System.out.println();

        }
        System.out.println("Macierz B");
        for (int lin = 0; lin < b.length; lin++) {
            for (int col = 0; col < b.length; col++) {
                System.out.print(b[lin][col] + "\t");
            }
            System.out.println();

        }

        for (int lin = 0; lin < b.length; lin++) {
            for (int col = 0; col < b.length; col++) {
                b[lin][col] = a[col][lin];
            }
        }

        System.out.println("Macierz B po przepisaniu macierzy A.");
        for (int lin = 0; lin < b.length; lin++) {
            for (int col = 0; col < b.length; col++) {
                System.out.print(b[lin][col] + "\t");
            }
            System.out.println();

        }

    }
}
