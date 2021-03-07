public class Bug {

    String bugDescription;
    String email;
    int bugPriority;
    boolean bugStatus;

//    KONSTRUKTOR
    Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }
//    METODY
    void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + " email: " + email + " bug priority: " + bugPriority +
                " Bug status: " + bugStatus);
    }

    void showEmail() {
        System.out.println("Email: " + email);
    }

    void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
    }

    int getBugPriority() {
        return bugPriority;
    }
}
