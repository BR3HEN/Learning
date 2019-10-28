package main;

public class Table_4_1 {
    public static void main(String[] arg){

        System.out.println("Program pokazuje wartość indeksów tablicy 10cio elementowej.");
//Zad 4.1
        int[] dane = new int[10];
        for(int i = 0; i <dane.length; i++){
            dane [i] = i;
            System.out.println("dane [" + i + "] " + "= " + i);
        }
        System.out.println();
//Zad 4.2
        int[] dane2 = new int[10];
        int j = 9;
        for(int i = 0; i <dane.length; i++){
            dane2 [i] = j;
            System.out.println("dane [" + i + "] " + "= " + j);
            j--;
        }

    }
}
