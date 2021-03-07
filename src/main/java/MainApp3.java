public class MainApp3 {

//    public static void main(String[] args) {
//
////        Typ nazwa = nowy obiekt;
//
//        User przemek = new User("Przemek", "Testowy", "przemek@test.pl", 17);  // utworzenie obiektu poprzez wywowałanie konstruktora
//        przemek.getAllInfo();
//
//        User tomek = new User("Tomek", "Testowy", "tomek@test.pl", 20);
//        tomek.getAllInfo();
//    }

    public static void main(String[] args) {

        Bug bug1 = new Bug("Small bug", "email@test.pl", 2);

        bug1.showBugStatus();
        bug1.showAllBugInfo();
        bug1.showEmail();
        int bugPriority = bug1.getBugPriority();
        System.out.println(bugPriority);

        bug1.bugStatus = true;

        bug1.showBugStatus();
    }
}
