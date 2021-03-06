public class MainApp3 {

    public static void main(String[] args) {

//        Typ nazwa = nowy obiekt;

        User przemek = new User();
        przemek.firstName = "Przemek";
        przemek.lastName = "Testowy";
        przemek.age = 30;
        przemek.email ="przemek@test.pl";
        przemek.isAdult = true;
        System.out.println(przemek.firstName);

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Testowy";
        tomek.age = 30;
        tomek.email ="tomek@test.pl";
        tomek.isAdult = true;
        System.out.println(tomek.firstName);
        System.out.println(tomek.isAdult);
    }
}
