package main;

public class forEach_4_15 {
    public static void main(String[] arg){

        System.out.println("Program sumuje tablicę z wartościami od 1 do 100");


        int [] data = new int[100];

        for (int i = 0; i < data.length; i++){
            data[i] = i +1;
        }
        int sum = 0;
        for (int x: data){
            sum += x;
        }
        System.out.println("Suma liczb tablicy to: " + sum);

        System.out.println("\nSuma liczb parzystych i nieparzystych. (ZAD. 4.16)");

        int sum1 = 0, sum2 = 0;
        for (int x: data){
            if (x %2 == 0) sum1 += x;
            else sum2 += x;
        }
        System.out.println("Suma liczb parzystych to : " + sum1);
        System.out.println("Suma liczb nieparzystych to : " + sum2);
    }
}
