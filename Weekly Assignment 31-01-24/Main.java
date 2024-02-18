//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
import java.util.*;

class Student{
    int rollno;
    String name;
    int number_of_subjects;
    double marks[];

    Student(int roll,String stud_name,int noofsub)
    {
        rollno = roll;
        name = stud_name;
        number_of_subjects= noofsub;
        getMarks(noofsub);
    }

    public void getMarks(int no_sub){
        marks = new double[no_sub];
        Scanner m = new Scanner(System.in);
        for(int i = 0; i < no_sub; i++){
            System.out.print("Enter marks of" + (i+1) + "th subject : ");
            marks[i] = m.nextDouble();
        }
    }

    public void printStudentDetails(){
        System.out.println("Name of the Student : " + name);
        System.out.println("Roll No. of Student : " + rollno);
    }
}
public class Main {
    static void calculatePercentage(double[][] Marks, double[] percentage, Student[] student, ArrayList<Integer> personel,
                                    int min, int max, int fail, ArrayList<Integer> toppers, int n, ArrayList<Integer> avgStudents){
        for(int i = 0; i < Marks.length; i++){
            double avg = 0.0;
            int j = 0;
            for(; j < n; j++){
                if(Marks[i][j] <= fail){
                    if(!personel.isEmpty() && personel.getLast() != i){
                        personel.add(i);
                    }
                }
                avg += Marks[i][j];
            }
            avg /= n;
            if(j == n){
                if(avg >= max){
                    toppers.add(i);
                }
                else if(avg <= min){
                    personel.add(i);
                }
                else{
                    avgStudents.add(i);
                }
            }
            percentage[i] = avg;
        }
    }
    static void firstTopper(ArrayList<Integer> First, ArrayList<Integer> toppers, double[] percent){
        double top = 0;
        int idx = 0;
        for (Integer topper : toppers) {
            top = Math.max(top, percent[topper]);
        }
        for (Integer topper : toppers) {
            if (percent[topper] == top) {
                First.add(topper);
            }
        }
    }
    public static void main(String[] args) {
        String Name;
        int Roll;
        int minThreshold = 40;
        int maxThreshold = 85;
        int failThreshold = 33;
        Scanner objs = new Scanner(System.in);
        Scanner objn = new Scanner(System.in);
        System.out.print("Enter no. of Students in the class : ");
        int no_of_stud = objn.nextInt();
        Student[] students = new Student[no_of_stud];
        System.out.print("Enter no. of subjects : ");
        int no_of_sub = objn.nextInt();

        for(int i = 0; i < no_of_stud; i++){
            System.out.print("Enter Name of " + (i+1) + "th Student : ");
            Name = objs.nextLine();
            System.out.print("Enter Roll No. of " + (i+1) + "th Student : ");
            Roll = objn.nextInt();
            students[i] = new Student(Roll, Name, no_of_sub);
        }
        double[][] Marks = new double[no_of_stud][no_of_sub];
        for(int i = 0; i < no_of_stud; i++){
            Marks[i] = students[i].marks;
        }
        double[] percentage = new double[no_of_stud];
        ArrayList<Integer> personalAttention = new ArrayList<>();
        ArrayList<Integer> toppers = new ArrayList<>();
        ArrayList<Integer> FirstTopper = new ArrayList<>();
        ArrayList<Integer> avgStudents = new ArrayList<>();

        System.out.println("marks length :" + Marks.length);
        calculatePercentage(Marks, percentage, students, personalAttention, minThreshold, maxThreshold, failThreshold, toppers, no_of_sub,avgStudents);
        firstTopper(FirstTopper, toppers, percentage);

        System.out.println("Toppers of the class are : ");
        for (int j : toppers) {
            students[j].printStudentDetails();
            System.out.println("Percentage : " + percentage[j]);
        }
        
        System.out.println("Students that need personal attention are : ");
        for (int j : personalAttention) {
            students[j].printStudentDetails();
            System.out.println("Percentage : " + percentage[j]);
        }

        System.out.println("Topper is : ");
        for (int j : FirstTopper) {
            students[j].printStudentDetails();
            System.out.println("Percentage : " + percentage[j]);
        }

        System.out.println("Average Students are : ");
        for (int j : avgStudents) {
            students[j].printStudentDetails();
            System.out.println("Percentage : " + percentage[j]);
        }
    }
}