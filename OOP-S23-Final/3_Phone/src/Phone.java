import java.util.*;

public abstract class Phone {
    String manufacturer;
    double batteryPower, storage;
    
    public Phone(String manufacturer, double batteryPower, double storage){
        this.manufacturer = manufacturer;
        this.batteryPower = batteryPower;
        this.storage = storage;
    }
    
    public abstract void call(String toPhNum);
    
    public abstract void sendMessage(String toPhNum, String msg);
}

class SmartPhone extends Phone implements SmartDevice{
    String operatingSystem;
    
    public SmartPhone(String manufacturer, String operatingSystem, double batteryPower, double storage){
        super(manufacturer, batteryPower, storage);
        this.operatingSystem = operatingSystem;
    }
    
    @Override
    public void runApp(String appName){
        System.out.println("Running "+appName);
    }
    
    @Override
    public void call(String toPhNum){
         System.out.println("Calling "+toPhNum);
    }
    
    @Override
    public void sendMessage(String toPhNum, String msg){
        System.out.println(msg);
        System.out.println("Message sent to "+toPhNum);
    }
    
    public void call(String toPhNum, String usingApp){
        runApp(usingApp);
        call(toPhNum);
    }
}
