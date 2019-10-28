package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_4_17 {
    public static void main(String[] arg) {
        System.out.println("Program pokazuje liczby w ArrayList, usuwa 2 liczbę i wstawia kolejną.");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(51);
        numbers.add(-72);
        numbers.add(4);
        numbers.add(14);
        numbers.add(-4);

        System.out.println("Liczby nieuporządkowane:");
        for (int x = 0; x < numbers.size(); x++){
            if (x <= 4) System.out.print(numbers.get(x) + ", ");
            else System.out.print(numbers.get(x) + ".");
        }
        Collections.sort(numbers);
        System.out.println("\n\nElementy postortowane listy:");
        for (int x = 0; x < numbers.size(); x++){
            if (x <= 4) System.out.print(numbers.get(x) + ", ");
            else System.out.print(numbers.get(x) + ".");
        }
        numbers.remove(1);
        System.out.println("\n\nUsunięto drugi element z listy.");
        numbers.add(10);
        System.out.println("\nLiczby nieuporządkowane po zmianach :");
        for (int x = 0; x < numbers.size(); x++) {
            if (x <= 4) System.out.print(numbers.get(x) + ", ");
            else System.out.print(numbers.get(x) + ".");
        }
        Collections.sort(numbers);
        System.out.println("\n\nLiczby uporządkowane po zmianach:");
        for (int x = 0; x < numbers.size(); x++) {
            if (x <= 4) System.out.print(numbers.get(x) + ", ");
            else System.out.print(numbers.get(x) + ".");
        }
    }
}
