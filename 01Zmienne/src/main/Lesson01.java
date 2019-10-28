package main;

public class Lesson01 {

    public static void main(String[] arg){
        //Typy zmiennych

        int x = 5;
        Integer x2 = new Integer(2);
        //Typ zmiennej int, skrócona jak i długa wersja
        //Int zawiera w sobie liczby całkowite

        System.out.println(x);
        System.out.println(x2);
        //komenda ta odpowiada za wyświetlanie kodu na konsoli

        String z = "xyz";
        String z2 = new String("zyx");
        //String jest to łańcuch znaków (skrócona wersja i długa)

        System.out.println(z);
        System.out.println(z2);

        char y = 'd';
        Character y2 = new Character('c');
        //char to typ zmiennej znakowej, zawiera w sobie tylko jeden znak

        System.out.println(y);
        System.out.println(y2);

        char c = 'a';
        char g = 'b';

        String a = String.valueOf(c) + String.valueOf(g);
        //Komenda ta oznacza stworzenie zmiennej typu String na podstawie 2 zmiennych typu char
        //przekształca je od razu w zmienne typu String

        System.out.println(a);

        float f = 0.12345f;
        double d = 9.987654321;
        //Zmienne zmienno przeciwnkowe, float o mniejszej precyzji oraz double o większej

        System.out.println(f);
        System.out.println(d);

    }
}
