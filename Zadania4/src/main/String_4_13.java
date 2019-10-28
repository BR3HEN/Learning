package main;

import java.util.Scanner;

public class String_4_13 {
    public static void main(String[] arg){

        System.out.println("Program wyświetla ilość znaków w podanym przez Ciebie imieniu i nazwisku.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String name = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = sc.nextLine();

        System.out.println("Imię " + name + " zawiera " + name.length() + " liter.");
        System.out.println("Nazwisko " + lastName + " zawiera " + lastName.length() + " liter.");
        System.out.println("Zadanie 4.14");
        System.out.println(name + " + " + lastName + " = " + name.concat(lastName));

        if (name.equals(lastName)) System.out.println("Składanie 2 równych znaków jest przemienne.");
        else System.out.println("Składanie 2 różnych znaków nie jest przemienne.");

    }
}
