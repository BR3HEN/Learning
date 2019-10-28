package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pole_1_1 {
    public static void main(String[] arg) throws IOException {

        double pole, a, b;

        BufferedReader value = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Podaj długość boku a: ");
            a = Double.parseDouble(value.readLine());


            System.out.println("Podaj długość boku b: ");
            b = Double.parseDouble(value.readLine());

            pole = a * b;
            System.out.println("Pole prostokąta wynosi: " + pole);
    }
}
