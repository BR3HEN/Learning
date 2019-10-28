package main;

public class breakAndContinue {
    public static void main(String[] args){

        for(int i = 0; i <10; i++){
            if (i == 5)
//              continue;
                break;
            System.out.println(i);
        }
        System.out.println();

        for (int x = 0; x <= 10; x++){
            if (x % 2 != 0)
                continue;
            System.out.println(x);
        }
    }
}
