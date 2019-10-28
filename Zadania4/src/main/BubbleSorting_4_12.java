package main;

public class BubbleSorting_4_12 {
    public static void main(String[] arg){

        System.out.println("Program sortuje 6 liczb: 574, 303, 34, 125, 8, 23.");

        int[] numbers = {574, 303, 34, 125, 8, 23};
        System.out.println("Liczby to:");
        for (int x = 0; x < numbers.length; x++){
            if (x <= 4) System.out.print(numbers[x] + ", ");
            else System.out.print(numbers[x] + ".");
        }
        System.out.println("\nLiczby po sortowaniu:");

        int y;
        for (int a = 1; a <= numbers.length-1; a++) {//powtarza to wszystko z każdą kolejną mniejsza liczbą
            for (int b = numbers.length-1; b >= a; b--) {//łapie najmniejszą liczbe i przesuwa do pierwszego indeksu
                if (numbers[b - 1] > numbers[b]) {//warunek, jeśli przedostatnia liczba jest większa od ostatniej to:
                    y = numbers[b - 1];//przedostatnią skopiuj do wolnej zmiennej
                    numbers[b - 1] = numbers[b];//w miejsce przedostatniej zastąp ostatnią
                    numbers[b] = y;//ostatnią zastąp tą większą, wcześniej skopiowaną
                }
            }
        }

/*        int a = 1;
        int b, y;
        while (a <= numbers.length-1){
            b = numbers.length-1;
            while (b >= a){
                if (numbers[b-1] > numbers[b]){
                    y = numbers[b-1];
                    numbers[b-1] = numbers[b];
                    numbers[b] = y;
                }
                b--;
            }
            a++;
        }

 */

        for (int x = 0; x < numbers.length; x++){
            if (x <= 4) System.out.print(numbers[x] + ", ");
            else System.out.print(numbers[x] + ".");
        }

    }
}
