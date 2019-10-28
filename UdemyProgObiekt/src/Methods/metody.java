package Methods;

public class metody {
    public static void main(String[] arg){

        Test a = new Test();
        a.test("Krzysiek", "Gorzkiewicz");
        System.out.println(a.plus(3,5));
        double result = a.divide(5,0);
        System.out.println(result);
        double result2 = a.divide(5,3);
        System.out.println(result2);
    }

    static class Test {
        void test(String name, String surname){
            System.out.println("Imię: " + name);
            System.out.println("Nazwisko: " + surname);
        }

        int plus(int a, int b){
            return a + b;
        }

        double divide(double a, double b){
            if (b == 0)
                return 0;

            System.out.println("lalal");
            return a / b;
        }
    }
}
