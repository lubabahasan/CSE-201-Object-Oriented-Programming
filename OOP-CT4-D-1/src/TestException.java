import java.util.*;

class InvalidParameterException extends Exception {
    public InvalidParameterException(String message) {
        super(message);
    }
}

public class TestException {
    public static void checkVoter(int age) throws InvalidParameterException {
        if (age < 18) {
            throw new InvalidParameterException("Should be at least 18 years old to be eligible for vote.");
        } else {
            System.out.println("Age: " + age);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkVoter(age);
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidSelectionException extends Exception {
    public InvalidSelectionException(int input) {
        super(input + " is not a valid selection");
    }
}