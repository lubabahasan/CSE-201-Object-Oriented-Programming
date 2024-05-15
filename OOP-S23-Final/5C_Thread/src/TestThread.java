import java.util.*;

class ThreadJob implements Runnable{
    int n, min, max;
    public ThreadJob(int n, int min, int max){
        this.n = n;
        this.min = min;
        this.max = max;
    }
    
    @Override
    public void run() {
        Random rand = new Random();
        System.out.println("Printing "+n+" integers between "+min+" and "+max+" :");
        for(int i=0; i<n; i++){
            int num = rand.nextInt(min+1, max-1);
            System.out.println(Thread.currentThread().getName() + " " + num);
        }
        System.out.println("");
    }
    
}

public class TestThread {
    
    public static void main(String[] a) throws InterruptedException{
        Thread t1 = new Thread( new ThreadJob(10, 1, 100));
        Thread t2 = new Thread( new ThreadJob(5, 101, 200));
        Thread t3 = new Thread( new ThreadJob(8, 201, 300));
        
        try{
            t1.start();
            t1.join(); 
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
