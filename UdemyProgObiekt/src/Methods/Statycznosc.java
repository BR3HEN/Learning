package Methods;

public class Statycznosc {
    public static void main(String[] arg){
        double wynik = Matematyka.dodaj(5,5);
        System.out.println(wynik);
        Klient a = new Klient("Wacław");//tworzy instancję
        Klient b = new Klient("John");
        Klient c = new Klient("Cecil");
        System.out.println(a.id);//wyświetla ID klienta
        System.out.println(b.id);
        System.out.println(c.id);
    }
}
class Matematyka {//klasa matematyka
    static double dodaj(int a, int b) {//statyczna oznacza, że nie trzeba tworzyć instancji, tylko od razu wywoływać metody w tej klasie
        return a + b;// zwróc wartość
    }
}
class Klient {//klasa klient
    Klient (String imie){
    this.imie = imie;//odwoływanie się do obecnej zmiennej pracującej
    nastepneID++;//przypisuje do początkowej wartości 0, 1
    id = nastepneID;//dopisuje te wartość do stworzonego obiektu

    }
    String imie;
    int id = 0;//wartość początkowa id
    static int nastepneID = 0;//wartość początkowa nastepneID
}
