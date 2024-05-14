import java.util.*;

class InvalidContestantException extends Exception {
    public InvalidContestantException(int min, int max) {
        super("You should be between " + min + " and " + max + " to participate in the contest.");
    }
}

public class TestException {

    public static void checkContestant(String name, int age) throws InvalidContestantException {
        if (age >= 18 && age <= 25) {
            System.out.println("Name: " + name + ", Age: " + age);
        } else {
            throw new InvalidContestantException(18, 25);
        }
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter contestant's name: ");
        String name = scan.nextLine();
        System.out.print("Enter contestant's age: ");
        int age = scan.nextInt();

        try {
            checkContestant(name, age);
        } catch (InvalidContestantException e) {
            System.out.println(e.getMessage());
        }
    }
}


/*public class TestException {
    public static void checkContestant(String name, int age) throws InvalidContestantException{
        if(age>18 && age<25)
            System.out.println(name+" "+age);
        else
            throw new InvalidContestantException(18, 25);
    }
    
    public static void main(String[] a){
        Scanner scan = new Scanner(System.in);
        int age;
        String name;
        
        System.out.println("Enter name: ");
        name = scan.nextLine();
        System.out.println("Enter age: ");
        age = scan.nextInt();
        
        try{
            checkContestant(name, age);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
*/
