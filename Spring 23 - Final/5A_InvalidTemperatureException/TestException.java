
class InvalidTemperatureException extends Exception {
    double minTemp, maxTemp;
    public InvalidTemperatureException(double minTemp, double maxTemp){
        super("Temperature should be between "+minTemp+" and "+maxTemp);
    }
    
}

public class TestException{
    public static void runAirCooler (double temp) throws InvalidTemperatureException {
        if(temp>10 && temp<28)
            System.out.printf("Running at %.2f\n",temp);
        else
            throw new InvalidTemperatureException(10, 28);
    }
    
    public static void main(String[] a){
        try{
            runAirCooler(15);
            runAirCooler(30);
        } catch(InvalidTemperatureException e){
            System.out.println(e.getMessage());
        }
    }
}
