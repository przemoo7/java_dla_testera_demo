public class User {
// KLASA - FORMA, SZABLON KTÓRA SLUŻY DO TWORZENIA OBIEKTÓW

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

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    //    PRZECIĄŻANIE METOD - TWORZYMY METODY O TYCH SAMYCH NAZWACH, RÓŻNIĄCE SIĘ PARAMETRAMI (ILOścią, TYPAMI)
    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you!");
    }


    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

    //    3. KONSTRUKTOR  - SLuZY do TWORZENIA OBIEKTOW
//    DOMYSLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

//    Nazwa konstruktora jest taka sama jak nazwa klasy
//    Konstruktor piszemy wielka litera
//    Konstruktor nie ma zwracanego typu

    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }
}