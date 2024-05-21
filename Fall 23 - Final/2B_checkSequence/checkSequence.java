
public class checkSequence {
    public static boolean checkSequence(int a, int b, int c){
        if(a-b == b-c)
            return true;
        else
            return false;
    }
    
    public static void main(String[] a){
        System.out.println(checkSequence(11,12,13));
        System.out.println(checkSequence(12,14,15));
    }
}
