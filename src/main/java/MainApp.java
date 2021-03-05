public class MainApp {

    public static void main(String[] args) {
//        operatory matematyczne
        double a = 10;
        double b = 4;

        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(10.0 / 4.0);

    //        operatory porównania

        int numOne = 1;
        int numTwo = 2;

        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

    //        operatory logiczne
    //        || - lub
        System.out.println(numOne > numTwo || numOne == 1 );  // falsz || prawda -> prawda
        System.out.println(numOne > numTwo || numOne != 1 );  // falsz || falsz -> falsz
        System.out.println(numOne < numTwo || numOne != 1 );  //  prawda || nie jest sprawdzana -> prawda
    //     && - i
        System.out.println(numOne < numTwo && numOne == 1 );  // prawda i prawda -> prawda
        System.out.println(numOne > numTwo && numOne == 1 );  // falsz i prawda -> prawda
        System.out.println(numOne > numTwo && numOne != 1 );  // falsz i falsz -> falsz

    }
}

