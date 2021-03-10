import model.Bug;

public class MainApp6 {
    public static void main(String[] args) {

        Bug bug = new Bug("This is new bug", "przemek@test.com", 1);

        bug.showAllBugInfo();

        bug.setBugPriority(99);

        bug.showAllBugInfo();

    }
}
