public class ZadanieDomoweLekcja1 {

    public static void main(String[] args) {

        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 4;
        int numberFour = 4;

        int sumA = numberOne + numberTwo;
        int sumB = numberThree + numberFour;

        System.out.println("sumA");
        System.out.println("sumB");

        if (sumA % 2 == 0 && sumB % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste");
        } else {
            System.out.println("Nie wszystkie liczby są parzyste");
        }
    }
}

