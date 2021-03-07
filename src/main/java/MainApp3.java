public class MainApp3 {

    public static void main(String[] args) {

//        Typ nazwa = nowy obiekt;

        User przemek = new User();
        przemek.firstName = "Przemek";
        przemek.lastName = "Testowy";
        przemek.age = 10;
        przemek.email = "przemek@test.pl";
        przemek.isAdult = false;
        przemek.getFullName();
        przemek.getAllInfo();
        System.out.println(przemek.getUserAge());
        int userAge = przemek.getUserAge();
        System.out.println(userAge);

        boolean userAdult = przemek.isUserAdult();
        System.out.println("Czy Przemek jest dorosły: " + userAdult);

        przemek.greetings("Marcin");
        przemek.greetings("Zuzia");
        przemek.howOldAreYou("Przemek", 17);

        int przemekAgePlus10 = przemek.yourAgePlus10(17);
        System.out.println(przemekAgePlus10);

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Testowy";
        tomek.age = 20;
        tomek.email = "tomek@test.pl";
        tomek.isAdult = true;
        tomek.getFullName();
        tomek.getAllInfo();

        boolean isTomekAdult = tomek.isUserAdult();
        System.out.println("Czy Tomek jest dorosły: " + isTomekAdult);

        System.out.println(tomek.yourAgePlus10(tomek.age));
    }
}
