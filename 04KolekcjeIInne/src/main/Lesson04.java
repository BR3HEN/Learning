package main;

import java.util.HashSet;
import java.util.Set;

public class Lesson04 {
    public static void main(String [] arg){

        Set<String> serString = new HashSet<>();

        serString.add("Jeden");
        serString.add("Dwa");
        serString.add("Trzy");

        serString.add("Trzy");
        serString.add("Cztery");
        serString.add("Pięć");

        System.out.println(serString.size());


        for (String s: serString){
            System.out.println(s);
        }

    }
}
