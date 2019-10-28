package main;

public class wprowadzanieObiektów {
    public static void main(String[] args){

//Tworzenie obiektu t1, który posłuży do pierwszej metody (domyślny konstruktor)
        Telewizor t1 = new Telewizor();
//przypisanie wartości za pomocą metody set
        t1.setMarka("Sony");
        t1.setPrzekatna(50);
//wywołanie metodą get i wyświetlenie wartości
        System.out.println(t1.getMarka());
        System.out.println(t1.getPrzekatna());

        System.out.println();

//Tworzenie obiektu t2, który posłuży do metody drugiej (własny konstruktor)
//Jak widać przypisanie wartości początkowych odbywa się już przy tworzeniu obiektu
        Telewizor t2 = new Telewizor("Samsung", 55);
//Wywołanie metody get podobnie jak w przypadku pierwszym
        System.out.println(t2.getMarka());
        System.out.println(t2.getPrzekatna());





    }

}
