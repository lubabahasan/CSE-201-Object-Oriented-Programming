
abstract class Vehicle {
    String make, model, fuelType;
    double mileage;
    int year;
    
    public Vehicle(String make, String model, String fuelType, double mileage, int year){
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.year = year;
    }
    
    public void update(String newModel, int newYear){
        model = newModel;
        year = newYear;
    }
    
    public abstract void displayFeatures();
}
