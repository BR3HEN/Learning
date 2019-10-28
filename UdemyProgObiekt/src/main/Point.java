package main;

public class Point {

    Point(){
        System.out.println("Wywołano konstruktor domyślny.");
    }

    Point(int x, int y){
        System.out.println("Wywołano konstruktor z dwoma argumentami.");

        this.x = x;
        this.y  = y;
    }

    int x;
    int y;

}
