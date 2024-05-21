import java.util.*;

class OddDivByThree extends Thread {
    int max;
    
    public OddDivByThree (int max){
        this.max = max;
    }
    
    @Override
    public void run(){
        Random rand = new Random();
        for(int i = 0 ; i < 10 ; i++){
            int num = rand.nextInt(0, max);
            if(num%2!=0 && num%3==0){
                System.out.println(Thread.currentThread().getName() + " : " + num);
            }
        }
    }
}

public class TestThread {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first maximum value : ");
        int max1 = scan.nextInt();
        System.out.print("Enter second maximum value : ");
        int max2 = scan.nextInt();
        System.out.print("Enter third maximum value : ");
        int max3 = scan.nextInt();
        
        OddDivByThree t1 = new OddDivByThree(max1);
        OddDivByThree t2 = new OddDivByThree(max2);
        OddDivByThree t3 = new OddDivByThree(max3);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
