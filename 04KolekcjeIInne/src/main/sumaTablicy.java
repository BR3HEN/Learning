package main;

public class sumaTablicy {
    public static void main(String[] args) {

        int [] liczby = {1, 12, 21, 32, 43, 54};

        int suma = 0;

/*        for (int i = 0; i < liczby.length; i++)
        {
            suma = suma + liczby[i];
        }
        System.out.println(suma);

 */
        for (int abc: liczby){
            suma += abc;
        }
        System.out.println(suma);
    }
}
