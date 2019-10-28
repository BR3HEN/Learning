package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson03 {
    public static void main(String[] arg){

        List<String> ListaStr = new ArrayList();
/*
Tworzenie listy typu String, nie wolno korzystać z typów prostych jak int tylko odwoływać się bezpośrednio do klasy jak
Integer. Nazwa listy i tworzenie listy typu array, są różne typy do innych celów.
 */
        ListaStr.add("Jeden");
        ListaStr.add("Dwa");
        ListaStr.add("Trzy");
/*
Przypisywanie wartości do listy, jak w przypadku tablicy lista składa się z indeksów licząc od "0"
 */

        for (int x = 0; x < ListaStr.size(); x++) {
/*
W przypadku tablicy, która jest szacowana w długości .length, natomiast Lista szacowana jest w wielkości .size
 */
            System.out.println(ListaStr.get(x));
/*
.get wydobywa wartość z listy
 */
        }
        System.out.println(ListaStr.size());
/*
Funkcja ta wyświetla liczbę indeksów w liście
 */
        ListaStr.add(1, "Zero");
/*
Zastępowanie wartości wybranego indeksu inną wartością, reszta indeksów automatycznie przesuwa się o 1 w dół.
 */
        for (String s : ListaStr) {
            System.out.println(s);
        }
/* pętla for each działa na każdy indeks, najpierw tworzysz zmienną jakiegoś typu i przypisujesz do niej liste
z której ma czerpać informacje
 */
        System.out.println(ListaStr.size());

        ListaStr.remove(1);
/*
Usuwa wartość indeksu wybranego
 */
        for (String a : ListaStr) {
            System.out.println(a);
        }
        System.out.println(ListaStr.size());

        System.out.println(ListaStr.contains("Zero"));
/*
Wyświetla wartość true or folse dla wartości Zero w ListaStr
 */
        System.out.println(ListaStr.indexOf("Dwa"));
/*
Wyświetla w którym indeksie znajduje się dany łańcuch znaków
 */
    }
}
