package main;

public class PętlaWPętliTabMnoż {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0)
                continue;
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
