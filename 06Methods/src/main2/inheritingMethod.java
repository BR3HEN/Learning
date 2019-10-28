package main2;

public class inheritingMethod {
    public static void main(String[] arg){

        DailyStudent sd = new DailyStudent();//nowy obiekt student dzienny na bazie klasy student dzienny
        sd.name = "Jan";
        sd.surname = "Studencki Dzienny";
        sd.attendanceAtTheLecture();//wywołanie metody z klasy bazowej "Student"
        sd.komunikat();//wywołanie metody z klasy student dzienny, klasy potomne mogą przechowywać swoje metody

        Part_TimeStudent sz = new Part_TimeStudent();//wywołanie nowego obiektu na bazie innej klasy
        sz.name = "Jan";
        sz.surname = "Studencki Zaoczny";
        sz.attendanceAtTheLecture();//dziedziczenie po bazowej klasie "Student"

        OnlineStudent so = new OnlineStudent();//kolejny nowy obiekt na bazie kolejnej klasy
        so.name = "Jan";
        so.surname = "Studencki Online";
        so.attendanceAtTheLecture();//wywołanie metody z klasy "OnLine Student", tutaj odbywa się przysłonięcie metody z klasy bazowej
        //wystarczy w metodzie potomnej zastosować metodę o tej samej nazwie co w klasie bazowej, wtedy metoda z klasy bazowej znika dla tej klasy potomnej

        OtherDailyStudent sdi = new OtherDailyStudent();//nowy obiekt
        sdi.attendanceAtTheLecture();//dziedziczy te metodę po klasie daily student, która ta zaś wcześniej odziedziczyła ją po klasie Student
        sdi.komunikat();//dziedziczy po klasie daily student te metodę

    }
}
