import java.util.*;

public class BMI {
    String name;
    double height, weight, BMI;
    
    public BMI(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    
    public double calculateBMI(){
        BMI = weight/(height*height);
        return BMI;
    }
    
    public String calculateRange(){
        if(BMI<18.5)
            return "Underweight";
        else if(BMI>=18.5 && BMI<24.9)
            return "Normal Weight";
        else if(BMI>=25 && BMI<29.9)
            return "Overweight";
        else if(BMI>=30 && BMI<34.9)
            return "Obesity I";
        else if(BMI>=35 && BMI<39.9)
            return "Obesity II";
        else
            return "Obesity III (Morbidly obese)";
    }
    
    public static void main(String[] a){
        Scanner scan = new Scanner(System.in);
        
        String name;
        double height, weight;
        
        System.out.print("Enter your name : ");
        name = scan.nextLine();
        
        System.out.print("Enter your height in metres: ");
        height = scan.nextDouble();
        
        System.out.print("Enter your weight in kilograms: ");
        weight = scan.nextDouble();
        
        BMI bmi = new BMI(name, height, weight);
        
        double temp = bmi.calculateBMI();
        String range = bmi.calculateRange();
        
        System.out.printf("Welcome %s! Your BMI is %.2f which falls in the range %s\n",name, temp, range);

    }
    
}


