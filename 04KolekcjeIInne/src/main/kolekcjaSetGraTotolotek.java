package main;

import java.util.*;

public class kolekcjaSetGraTotolotek {
    public static void main(String[] arg){

        Set<Integer> Totolotek = new HashSet<>();

        Random r = new Random();

        while (Totolotek.size() < 6)
        {
        int x = r.nextInt(36) + 1;
            Totolotek.add(x);
        }
        System.out.println();

        for (int i : Totolotek){
            System.out.println("Wylosowano " + i);
        }

        List<Integer> Lista = new ArrayList<>();
        Lista.addAll(Totolotek);
        System.out.println("After converted to Array List");

        for (int c = 0; c < Lista.size(); c++)
        {
            System.out.println(Lista.get(c));
        }



    }
}
