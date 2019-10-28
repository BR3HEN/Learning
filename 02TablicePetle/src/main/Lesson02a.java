package main;

public class Lesson02a {
    public static void main(String[] arg){

        int x = 0;
        int y = 0;

        int tab01[] = new int[5];

        tab01[0] = 1;
        tab01[1] = 2;
        tab01[2] = 3;
        tab01[3] = 4;
        tab01[4] = 5;

        while (x < tab01.length) {
            System.out.println(x + " : " + tab01[x]);
            x++;
        }

        System.out.printf("\n");

        do {
            System.out.println(y + " : " + tab01[y]);
            y++;
        } while (y < tab01.length);


    }
}
