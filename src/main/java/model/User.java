package model;

public class User {
// KLASA - FORMA, SZABLON KTÓRA SLUŻY DO TWORZENIA OBIEKTÓW

//   1. POLA OBIEKTU
//    OPISUJĄ TO Z CZEGO BĘDZIE SKLADAL SIE OBIEKT

    private String firstName;
    private String lastName;
    private String email;   //
    private int age;  //  0
    private boolean isAdult;   //false

//    2.METODY
//    OPISUJĄ CO DANY OBIEKT BĘDZIE MÓGL ZROBIC

    // zwracany typ + nazwa metody
    public void getFullName() {
        //ciało metody
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    //    PRZECIĄŻANIE METOD - TWORZYMY METODY O TYCH SAMYCH NAZWACH, RÓŻNIĄCE SIĘ PARAMETRAMI (ILOścią, TYPAMI)
    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you!");
    }


    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    public int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

    //    3. KONSTRUKTOR  - SLuZY do TWORZENIA OBIEKTOW
//    DOMYSLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

//    Nazwa konstruktora jest taka sama jak nazwa klasy
//    Konstruktor piszemy wielka litera
//    Konstruktor nie ma zwracanego typu

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }
//    // ustawienie adresu email - metody ustawiajace prywatne pola -settery
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    //odczytanie adresu email - metody odczytujące prywatne pola - gettery
//    public String getEmail() {
//        return email;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith(".ru")) {
            System.out.println("Ru emails are not allowed!");
        } else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}