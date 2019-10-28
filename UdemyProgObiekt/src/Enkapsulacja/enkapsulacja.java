package Enkapsulacja;

public class enkapsulacja {
    public static void main(String[] arg){

    BankAccount acc1 = new BankAccount();//zmienna saldo nie jest static, więc należy utworzyć obiek aby ją wywołać

        acc1.setBalance(10000);//ustawienie salda dodatkowego
        acc1.deposite(20);//wpłacanie kasy na konto
        acc1.withdraw(10001);//wypłata kasy z konta
        System.out.println("Saldo konta = " + acc1.getBalance());//wyświetlanie salda na koncie
    }
}

class BankAccount{
    private int saldo;//niektóre rzeczy nie powinny mieć dostępu do modyfikacji z zewnątrz,
//dlatego zmienna ta jest prywatna aby nikt z zewnątrz nie mógł jej modyfikowa.

    public BankAccount(){
        saldo = 1000;//zmienną saldo mozna modyfikować tylko i wyłącznie w obrębie tej samej klasy
    }

    int getBalance(){// aby uzyskać z zewnątrz wartość prywatnej zmiennej do tego służą gettery,
// czyli tworzenie metod w klasie aby móc się do niej odwołać z innej klasy
        return saldo;
    }

    boolean setBalance(int saldo){
        this.saldo = saldo;//this saldo ma pobrać wartość z argumentu, który przysyłany jest z zewnątrz
        return true;
    }

    boolean deposite(int ile){
        saldo += ile;//przypisywać do salda można tak
    return true;
    }

    boolean withdraw(int ile){
        if (ile > saldo) {
            System.out.println("Za mało pieniędzy na koncie.");
            return false;
        }
        else
            setBalance(saldo - ile);//odejmować od salda mozna tak jak przypisywać, ale też można odwołać się do wcześniej
//stworzonej metody i zrobić to właśnie tak
        return true;
    }

}

