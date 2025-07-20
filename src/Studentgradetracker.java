import java.util.ArrayList;
import java.util.Scanner;
class Student{
    String name;
    ArrayList<Integer> grades;

    Student(String name){
     this.name=name;
     grades = new ArrayList<>();

    }
    void addgrade(int grade){
        grades.add(grade);
    }
    double getAverage(){
        if(grades.isEmpty())return 0;
        int sum=0;
        for(int g:grades){
            sum+=g;
        }
        return(double) sum/grades.size();
    }
    int getHighest(){
        if ( grades.isEmpty())return 0;
        int max=grades.get(0);
        for(int g:grades){
            if(g>max)max=g;
        }
        return max;
    }
    int getLowest(){
        if (grades.isEmpty())return 0;
        int min= grades.get(0);
        for(int g:grades){
            if(g<min)min=g;
        }
        return min;
    }
    void displayreport(){
        System.out.println("sutdent:"+ name);
        System.out.println("grades:"+grades);
        System.out.println("average:"+ getAverage());
        System.out.println("highest:"+ getHighest());
        System.out.println("lowest:"+getLowest());
        System.out.println("----------------------------------------");
    }
}
public class Studentgradetracker{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Student>student = new ArrayList<>();

        System.out.print("Enter number of Student :");
        int studentCount=sc.nextInt();

        sc.nextLine();
        for (int i=0;i<studentCount;i++){
            System.out.print("Enter Student name :");
            String name =sc.nextLine();
            Student student1= new Student(name);

        System.out.print("Enter number of Grade for "+ name + ":");
        int gradeCount=sc.nextInt();

        for(int j=0;j<gradeCount;j++){
            System.out.print("enter grade"+ (j+1)+":");
            int grade =sc.nextInt();
            student1.addgrade(grade);

        }
         sc.nextLine();
        student.add(student1);

        }
        System.out.println("\n========Student grared repot======");
        for (Student s: student){
            s.displayreport();
        }
        sc.close();;
    }
}