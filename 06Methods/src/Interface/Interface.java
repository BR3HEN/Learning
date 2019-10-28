package Interface;

public class Interface {
    public static void main(String[] arg){

        Raporty r = new Raporty();
        r.title = "Raport01";

        r.generateRaport(r.title);
        System.out.println(r.rapGeneratedBy("Krzysiek"));
        r.show(r.title);
        r.print(r.title);
        System.out.println(r.deleteRaport(r.title));

    }
}
