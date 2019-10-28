package main;

public class prosteString {
    public static void main(String [] arg){

        int a = 12;
        int b = 12;

/*      if (a % 2 == 0)
            System.out.println("Parzysta");
        else
            System.out.println("Nieparzysta");
*/
        String czyRówne = a == b ? "Równe" : "Nierówne";

        System.out.println(czyRówne);

    }
}
