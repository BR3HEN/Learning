package main;

public class PrzeciążanieMetod_1 {
    public static void main(String[] arg){

        PrzeciążanieMetod_1 s = new PrzeciążanieMetod_1();
        s.method01();
        s.method01(" z parametrem");
        s.method01("z 1 parametrem", 5);

    }

    public void method01(){
        System.out.println("Test metody.");
    }

    public void method01(String arg){
        System.out.println("Test metody." + arg);
    }

    public void method01(String arg, int x){
        System.out.println("Test metody." + arg + " a tu znowu parametr " + x);
    }
}
