package main;

public class Telewizor {

    private String marka;
    private int przekatna;
//Konstruktor domyślny w celu wywołania metod  get i set, pierwsza metoda (Jest domyślny, nie trzeba go pisać jakbyśmy stosowali tylko metodę pierwszą
//w tym przypadku trzeba było napisać stworzony konstruktor metodą domyślną aby móc operować 2 metodami
    public Telewizor(){}
//Druga metoda (Code/generate/constructor) tworzy własny konstruktor do którego możemy przypisać wartości startowe-jeśli go stworzysz automatycznie
//przestaje działać konstruktor domyślny
    public Telewizor(String marka, int przekatna) {
        this.marka = marka;
        this.przekatna = przekatna;
    }
//Ta część dotyczy pierwszej metody
//get wywołanie metody, która podaje wartość
    public String getMarka() {
        return marka;
    }
//set wywołanie metody, która przypisuje wartość
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrzekatna() {
        return przekatna;
    }

    public void setPrzekatna(int przekatna) {
        this.przekatna = przekatna;
    }

    }
