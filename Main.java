package assignment;

public class Main {

    public static void main(String[] args) {
        new NamePrinter().printNames();
    }
}

class NamePrinter {
    /**
     * Prints the names of all group members of team 12 separated by dashes.
     */
    public void printNames() {
        String separator = "_";

        String[] names = {
                "Joshua Felix",
                "Nguyen Tran",
                "Hummad Khan"
        };

        System.out.println(String.join(separator, names));
    }
}
