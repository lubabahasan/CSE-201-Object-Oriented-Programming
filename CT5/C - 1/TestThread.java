import java.util.*;

class DivisibleByThree extends Thread {
    int min,max;
    public DivisibleByThree(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(min, max);
            if (num % 3 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + num);
            }
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first minimum and maximum: ");
        int min1 = scan.nextInt();
        int max1 = scan.nextInt();
        System.out.println("Enter second minimum and maximum: ");
        int min2 = scan.nextInt();
        int max2 = scan.nextInt();
        System.out.println("Enter third minimum and maximum: ");
        int min3 = scan.nextInt();
        int max3 = scan.nextInt();

        DivisibleByThree thread1 = new DivisibleByThree(min1, max1);
        DivisibleByThree thread2 = new DivisibleByThree(min2, max2);
        DivisibleByThree thread3 = new DivisibleByThree(min3, max3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
