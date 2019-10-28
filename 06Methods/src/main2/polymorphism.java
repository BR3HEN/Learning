package main2;

public class polymorphism {
    public static void main(String[] arg){

        Student [] studentTable = new Student[4];//zdefiniowanie tablicy studentTable typu student-bazowej klasy na podstawie obiektu student
        studentTable[0] = new DailyStudent();//przypisanie metod do tablicy z klas potomnych
        studentTable[1] = new Part_TimeStudent();//up
        studentTable[2] = new OtherDailyStudent();//up
        studentTable[3] = new OnlineStudent();//up
        //tablica która przechowuję polimorficzne obiekty

        for (int i = 0; i < studentTable.length; i++){
            studentTable[i].attendanceAtTheLecture();
        }//pętla wyświetla wybraną metodę, która znajduje się w każdej klasie
//___________________________________________________________________________________________________________________
        Student s = new OnlineStudent();//3) stworzenie nowego obiektu s typu student, który przechowuje wartości z klasy online student
        polymorphism.takeStudent(s);//wywołanie klasy takeStudent
    }
    //1) utworzenie nowej publicznej klasy typu student o nazwie s
    public static void takeStudent(Student s){
        s.attendanceAtTheLecture();//2) przypisanie do zmiennej s metody z klasy bazowej
//________________________________________________________________________________________________________________________________________

    }
    class obsluzStudenta{
        public void obsluz(Student d){
            d.attendanceAtTheLecture();
        }
    }
}
