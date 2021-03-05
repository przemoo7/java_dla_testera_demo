public class ZadanieDomoweLekcja1 {

    public static void main(String[] args) {

        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;

        int sumA = numberOne + numberTwo;
        int sumB = numberThree + numberFour;

        if (sumA % 2 == 0 && sumB % 2 == 0) {
            System.out.println("Liczby są parzyste");
        } else {
            System.out.println("Liczby są nieparzyste");
        }
    }
}

