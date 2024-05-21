import java.util.*;
import java.io.*;


public class FileReader {
    public static void main(String[] a){
        try(Scanner scan = new Scanner(new File("C:\\Users\\LUBABA\\Documents\\NetBeansProjects\\5C_FileReader\\src\\Convocation_2024.txt"))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] parts = line.split(" ");
                int i = 0;
                String name = "";
                while(true){
                    String temp = parts[i];
                    if(temp.charAt(0)>='A' && temp.charAt(0)<='Z'){
                        name+=temp;
                        name+=" ";
                        i++;
                    } else 
                        break;
                }
                String id = parts[i];
                i++;
                double cgpa = Double.parseDouble(parts[i]);
                
                if(cgpa>=3.95 && id.charAt(3)=='0' && id.charAt(4)=='1'){
                    System.out.printf("%s%s %.2f\n",name,id,cgpa);
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
