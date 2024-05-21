import java.util.*;

class OverflowException extends Exception {
    public OverflowException(int maxCapacity) {
        super("Cannot hold more than " + maxCapacity + " guest in the centre.");
    }
}

public class TestException {
    public static void reserve(String eventName, int noOfGuests) throws OverflowException {
        if (noOfGuests > 500) {
            throw new OverflowException(500);
        } else {
            System.out.println("The resource has been reserved for " + eventName + " with capacity: " + noOfGuests);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Event Name: ");
        String eventName = scan.nextLine();
        System.out.print("Enter No. of Total Guests: ");
        int noOfGuests = scan.nextInt();

        try {
            reserve(eventName, noOfGuests);
        } catch (OverflowException e) {
            System.out.println(e.getMessage());
        }
    }
}

