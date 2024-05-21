import java.util.*;

public class Bonus {
    public static double checkEligible(double salary, int year){
        if(year>2){
            double bonus;
            bonus = calculateBonus(salary, year);
            return bonus;
        } else {
            return 0;
        }
    }
    
    public static double calculateBonus(double salary, int year){
        double bonus;
        bonus = salary*Math.pow(1.05,(double)year)-salary;
        return bonus;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter salary: ");
        double salary = scan.nextDouble();
        System.out.println("Enter years of service: ");
        int year = scan.nextInt();
        
        if(checkEligible(salary, year)>0){
            System.out.println(checkEligible(salary, year));
        } else {
            System.out.println("not eligible yet");
        }
    }
}
