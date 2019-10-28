package main;

import java.util.HashMap;
import java.util.Map;

public class Lesson3a {
    public static void main(String[] arg) {

        Map<Integer, String> map = new HashMap<>();
/*
Tworzenie kolekcji Map składającej się z 2 wartości (par) ze sobą sprzężonych
 */
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
/*
Przypisywanie kluczy i wartości do kolekcji, klucze muszą różnić się od siebie, wartości już nie
 */
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            int key = m.getKey();
            String value = m.getValue();

            System.out.println(key + " : " + value);
        }

        System.out.println(map.values());


    }
}
