import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentId = in.nextInt();
        System.out.println("Enter Student's Name:");
        String studentName = in.next();
        System.out.println("Enter Student's address:");
        String studentAddress = in.next();

        while (true) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            String collegeName = in.next();

            if (collegeName.equalsIgnoreCase("Yes")) {
                collegeName = "NIT";
                Student student = new Student(studentId, studentName, studentAddress);
                System.out.println(student);
                break;
            } else if (collegeName.equalsIgnoreCase("No")) {
                System.out.println("Enter the college name:");
                collegeName = in.next();
                Student student = new Student(studentId, studentName, studentAddress, collegeName);
                System.out.println(student);
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
}
