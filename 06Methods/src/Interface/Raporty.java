package Interface;

public class Raporty extends Raport implements RaportyInterface {
    String title;
    public void show(String str) {System.out.println("Raport " + str + " wyświetlany na ekranie");}
    public void print(String str) {System.out.println("Drukowanie raportu " + str);}

//implementacja metod z interfejsu, tutaj należy nadpisać i zdefiniować te metody. @Override
    @Override
    public String deleteRaport(String str) {
        return "Raport " + str + " usunięty z syatemu.";
    }

    @Override
    public void generateRaport(String str) {
        System.out.println("Przygotowywanie raportu " + str);
    }
}
