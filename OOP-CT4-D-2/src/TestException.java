import java.util.*;

class InvalidParameterException extends Exception {
    public InvalidParameterException(String message) {
        super(message);
    }
}

public class TestException {
    public static void checkAttendance(int attendance, int totalClasses) throws InvalidParameterException {
        if (((double)attendance/totalClasses)*100 < 70) {
            String message = "Attendance percentage should be 70 or more to sit for the final exam";
            throw new InvalidParameterException(message);
        } else {
            System.out.println("Eligible for final exam");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student's Attendance: ");
        int attendance = scan.nextInt();
        System.out.print("Enter No. of Total Classes: ");
        int totalClasses = scan.nextInt();
        
        try {
            checkAttendance(attendance, totalClasses);
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidItemException extends Exception {
    public InvalidItemException(String input) {
        super(input + " is not a valid selection");
    }
}

