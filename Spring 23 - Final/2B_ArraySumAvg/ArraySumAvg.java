import java.util.*;

public class ArraySumAvg {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        
        int[] arr = new int[size];
        
        System.out.print("Enter "+size+" integers: ");
        for(int i=0; i<size; i++){
            arr[i]=scan.nextInt();
        }
        
        int sum = calculateSum(arr, size);
        double avg = sum/size;
        
        System.out.println("The sum of the elements: "+sum);
        System.out.printf("The average of the elements: %.2f\n",avg);
    }
    
    public static int calculateSum(int[] arr, int size){
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += arr[i];
        }
        return sum;
    }
}
