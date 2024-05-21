
class SchoolBus implements Vehicle {

    int capacity, currentPassengers, speed;
    String model;

    public SchoolBus(String model, int speed, int capacity) {  //parameterized constuctor
        this.model = model;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void start() {
        System.out.println("The " + model + " started at speed=" + speed + "\n");
        speed = speed + 5;
    }

    public void running(int val) {
        capacity += 50;
        System.out.println("Moving at speed=" + speed + "\n");
        int distance;
        distance = capacity + speed * val;
        System.out.println("Distance covered=" + distance + "\n");
    }

    public void stop() {
        System.out.println("Stopped.");
    }
}

public class TestSchoolBus {

    public static void main(String[] a) {
        SchoolBus bus = new SchoolBus("Yellow Bus", 30, 50);

        bus.start();
        
        bus.running(10);
        bus.speed = 40;
        
        bus.running(5);
        bus.stop();
    }
}
