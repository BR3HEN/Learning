package main;

public class Main {
    public static void main(String[] arg){

        Point p = new Point();
        Point p2 = new Point(10, 15);

        p.x = 5;
        p.y = 20;

        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);

        System.out.println("p2.x = " + p2.x);
        System.out.println("p2.y = " + p2.y);

    }
}
