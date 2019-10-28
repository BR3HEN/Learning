package main;

public class Matrix_4_9 {
    public static void main(String[] arg){

        System.out.println("Program dodaje do siebie dwie macierze, A i B.");

        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];

        System.out.println("Macierz A");
        for (int line = 0; line < a.length; line++){
            for (int column = 0; column < a.length; column++){
                a[line][column] = 1;
                System.out.print(a[line][column] + "\t");
            }
            System.out.println();
        }
        System.out.println("Macierz B");
        for (int line = 0; line < b.length; line++){
            for (int column = 0; column < b.length; column++){
                b[line][column] = 2;
                System.out.print(b[line][column] + "\t");
            }
            System.out.println();
        }
        System.out.println("Macierz C = A + B");
        for (int line = 0; line < c.length; line++){
            for (int column = 0; column < c.length; column++){
                c[line][column] = a[line][column] + b[line][column];
                System.out.print(c[line][column] + "\t");
            }
            System.out.println();
        }
        System.out.println("Macierz C = A - B (ZAD. 4.10)");
        for (int line = 0; line < c.length; line++){
            for (int column = 0; column < c.length; column++){
                c[line][column] = a[line][column] - b[line][column];
                System.out.print(c[line][column] + "\t");
            }
            System.out.println();
        }

        for (int line = 0; line < c.length; line++){
            for (int column = 0; column < c.length; column++){
                c[line][column] = 0;
            }
        }

        System.out.println("Macierz C = A * B (ZAD. 4.11)");
        for (int line = 0; line < c.length; line++){
            for (int column = 0; column < c.length; column++){
                for (int x = 0; x < c.length; x++){
                c[line][column] += a[line][x] * b[x][column];
                }
            }
        }
        for (int line = 0; line < c.length; line++){
            for (int column = 0; column < c.length; column++){
                System.out.print(c[line][column] + "\t");
            }
            System.out.println();
        }

    }
}
