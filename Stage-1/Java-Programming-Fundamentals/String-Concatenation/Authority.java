import java.util.Scanner;

public class Authority {

    private static void validate(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isSpaceChar(c) && !Character.isLetter(c)) {
                System.out.println("Invalid name");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inmate's name:");
        String inmate = in.nextLine();
        System.out.println("Inmate's father's name:");
        String father = in.nextLine();
        in.close();
        validate(inmate);
        validate(father);
        System.out.println(inmate.toUpperCase() + " " + father.toUpperCase());
    }
}
