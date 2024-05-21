abstract class Student {
    double highestCgpa;
}

class UnderGraduateStudent extends Student{}
class GraduateStudent extends Student{}

public class UAP {
    public static void setHighestCgpa(Student obj){
        if(obj instanceof UnderGraduateStudent)
            obj.highestCgpa = 4;
        else if(obj instanceof GraduateStudent)
            obj.highestCgpa = 5;
    }
    
    public static void main(String[] a){
        UnderGraduateStudent s1 = new UnderGraduateStudent();
        GraduateStudent s2 = new GraduateStudent();
        
        UAP.setHighestCgpa(s1);
        UAP.setHighestCgpa(s2);
        
        System.out.println(s1.highestCgpa + " " + s2.highestCgpa);
    }
}