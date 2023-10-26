package classpackage;

import java.util.Scanner;

class Subject 
{
    String name;
    int marks;
    public Subject(String name)
    {
        this.name = name;
    }
    public void setMarks(int marks) 
    {
        this.marks = marks;
    }
}

class Student
{
    String name;
    int rollNumber;
    Subject[] subjects;
    public Student(String name, int rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        //Creating array of two subjects
        subjects = new Subject[]{new Subject("Maths"),new Subject("English")};
    }
}

class Teacher
{
    Scanner sc = new Scanner(System.in);
    public void setMarks(Student student)
    {
        Subject[] subjects = student.subjects;
        for (Subject subject : subjects) 
        {
            System.out.print("Enter marks for "+subject.name+" Subject for "+student.name+" and rollno."+student.rollNumber+" : ");
            int marks = sc.nextInt();
            subject.setMarks(marks); //Teacher set the marks of a students on both the subjects
        }
    }
    //Calculating the average marks of a students
    public void findAverageMarks(Student[] students)
    {
        int totalMarks = 0,count = 0;
        for (Student student : students)
        {
            Subject[] subjects = student.subjects;
            for (Subject subject : subjects) 
            {
                totalMarks += subject.marks;
                count++;
            }
        }
        System.out.println("Average marks: " + ((double) totalMarks / count));
    }
    //Calculating the maximum and minimum marks of a students
    public void findMinMaxMarks(Student[] students)
    {
        int maxMarks = Integer.MIN_VALUE;
        int minMarks = Integer.MAX_VALUE;
        for (Student student : students)
        {
            Subject[] subjects = student.subjects;
            for (Subject subject : subjects)
            {
                int marks = subject.marks;
                maxMarks = Math.max(maxMarks, marks);
                minMarks = Math.min(minMarks, marks);
            }
        }
        System.out.println("Maximum marks: " + maxMarks);
        System.out.println("Minimum marks:" +minMarks);
    }
}

public class StudentData
{
    public static void main(String[] args)
    {
        Student[] students = new Student[10]; //Creating a array of 10 students
        for (int i = 0; i < 10; i++)
            students[i] = new Student("Student" + (i + 1), i + 1);

        Teacher teacher = new Teacher();
        for (Student student : students) 
            teacher.setMarks(student);
            
        Scanner sc = new Scanner(System.in);
        char choice;
        //Displaying all the choices using switch statement
        do 
        {
            System.out.println("\nSelect an option:");
            System.out.println("a> Find average of marks");
            System.out.println("b> Find Max and Min and display the marks");
            System.out.println("c> Exit");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            switch (choice)
            {
                case 'a': teacher.findAverageMarks(students);
                          break;
                case 'b': teacher.findMinMaxMarks(students);
                          break;
                case 'c': System.exit(0);
                default:  System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'c');
        sc.close();
    }
}