public class User {

//   1. POLA OBIEKTU
//    OPISUJĄ TO Z CZEGO BĘDZIE SKLADAL SIE OBIEKT

    String firstName;
    String lastName;
    String email;   //
    int age;  //  0
    boolean isAdult;   //false

//    2.METODY
//    OPISUJĄ CO DANY OBIEKT BĘDZIE MÓGL ZROBIC

    // zwracany typ + nazwa metody
    void getFullName() {
        //ciało metody
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}