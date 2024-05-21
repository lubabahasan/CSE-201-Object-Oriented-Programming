import java.io.*;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(new File("C:\\Users\\LUBABA\\Documents\\NetBeansProjects\\OOP-S23-Final\\5D_FilesIO\\src\\file.txt"))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                
                String[] parts = line.split(" ");
                
                String studentId = parts[0];
                
                int score = Integer.parseInt(parts[1]);
                
                String result;
                
                if(score >=40)
                    result = "P";
                else
                    result = "F";
                
                System.out.println(studentId + " " + result);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }
    }
}
