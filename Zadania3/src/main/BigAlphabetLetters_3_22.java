package main;

public class BigAlphabetLetters_3_22 {
    public static void main(String[] arg){

        System.out.println("Program wyświetla litery od A do Z i od Z do A.");

        System.out.println("Pętla for (Zad. 3.22)");
        for (char letters = 'A'; letters <= 'Z'; letters++){
            if(letters == 'Z')
                System.out.print(letters + ".");
            else
                System.out.print(letters + ", ");
        }
        System.out.println();

        for (char letters = 'Z'; letters >= 'A'; letters--){
            if(letters == 'A')
                System.out.print(letters + ".");
            else
                System.out.print(letters + ", ");
        }
        System.out.println();
        System.out.println("\nPętla do ... while (Zad. 3.23)");
        char lettStart = 'A';
        char lettEnd = 'Z';
        do {
            if(lettStart == 'Z')
                System.out.print(lettStart + ".");
            else
                System.out.print(lettStart + ", ");
            lettStart++;
        }while (lettStart <= 'Z');

        System.out.println();
        do {
            if(lettEnd == 'A')
                System.out.print(lettEnd + ".");
            else
                System.out.print(lettEnd + ", ");
            lettEnd--;
        }while (lettEnd >= 'A');

        System.out.println();
        System.out.println("\nPętla while (Zad. 3.24)");
        lettStart = 'A';
        lettEnd = 'Z';
        while (lettStart <= 'Z') {
            if(lettStart == 'Z')
                System.out.print(lettStart + ".");
            else
                System.out.print(lettStart + ", ");
            lettStart++;
        }

        System.out.println();
        while (lettEnd >= 'A') {
            if(lettEnd == 'A')
                System.out.print(lettEnd + ".");
            else
                System.out.print(lettEnd + ", ");
            lettEnd--;
        }

    }
}
