class DivByN extends Thread {
    int num;
    
    public DivByN (int num){
        this.num = num;
    }
    
    @Override
    public void run(){
        int n = 0;
        for(int i = 0 ; i < 10 ; i++){
            n = n+num;
            System.out.println(Thread.currentThread().getName() + " : " + n);
        }
    }
}

public class TestThread {
    public static void main(String[] args){
        
        int n1 = 2;
        int n2 = 3;
        int n3 = 5;
        
        DivByN t1 = new DivByN(n1);
        DivByN t2 = new DivByN(n2);
        DivByN t3 = new DivByN(n3);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
