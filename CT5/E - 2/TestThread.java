import java.util.*;

class Even extends Thread {
    int min,max;
    public Even(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        if(min%2!=0)
            min++;
        for (int i = min; i <= max; i+=2) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
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

        Even thread1 = new Even(min1, max1);
        Even thread2 = new Even(min2, max2);
        Even thread3 = new Even(min3, max3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
