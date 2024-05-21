import java.util.*;

class Sum extends Thread {
    int max;
    
    public Sum (int max){
        this.max = max;
    }
    
    @Override
    public void run(){
        Random rand = new Random();
        int sum = 0;
        for(int i = 0 ; i < 20 ; i++){
            sum += rand.nextInt(0, max);
        }
        System.out.println(Thread.currentThread().getName() + " : " + sum);
    }
}

public class TestThread {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 1st max number: ");
        int max1 = scan.nextInt();
        System.out.print("Enter 2nd max number: ");
        int max2 = scan.nextInt();
        System.out.print("Enter 3rd max number: ");
        int max3 = scan.nextInt();
        
        Sum t1 = new Sum(max1);
        Sum t2 = new Sum(max2);
        Sum t3 = new Sum(max3);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
