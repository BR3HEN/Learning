package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListNames_4_18 {
    public static void main(String[] arg){

        List<String> names = new ArrayList<>();
        names.add("Julia");
        names.add("Agata");
        names.add("Zenek");
        names.add("Jarek");
        names.add("Kasia");
        names.add("Dominika");
        System.out.println("Imiona nieposortowane:");
        for (int x = 0; x < names.size(); x++){
            if (x < names.size()-1) System.out.print(names.get(x) + ", ");
            else System.out.print(names.get(x) + ".");
        }
        Collections.sort(names);
        System.out.println("\n\nImiona posortowane:");
        for (int x = 0; x < names.size(); x++){
            if (x < names.size()-1) System.out.print(names.get(x) + ", ");
            else System.out.print(names.get(x) + ".");
        }
        names.remove(2);
        names.add("Eugeniusz");
        System.out.println("\n\nImiona nieposortowane po zmiane:");
        for (int x = 0; x < names.size(); x++){
            if (x < names.size()-1) System.out.print(names.get(x) + ", ");
            else System.out.print(names.get(x) + ".");
        }
        Collections.sort(names);
        System.out.println("\n\nImiona posortowane po zmianie:");
        for (int x = 0; x < names.size(); x++){
            if (x < names.size()-1) System.out.print(names.get(x) + ", ");
            else System.out.print(names.get(x) + ".");
        }

    }
}
