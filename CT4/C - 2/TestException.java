import java.util.*;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String id) {
        super(id + " is not a valid student.");
    }
}

public class TestException {
    public static void checkStudent(String name, String id) throws InvalidStudentException {
        if (id.length() == 8 && id.startsWith("22201")) {
            System.out.println("Name : " + name + ", ID: " + id);
        } else {
            throw new InvalidStudentException(id);
        }
    }

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student's name: ");
        String name = scan.nextLine();
        System.out.println("Enter Student's ID: ");
        String id = scan.nextLine();

        try {
            checkStudent(name, id);
        } catch (InvalidStudentException e) {
            System.out.println(e.getMessage());
        }
    }

}

