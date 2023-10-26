package inheritancepackage;

class Person  //Creating a parent class
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		super();
		this.name=name;
		this.age=age;
	}
	public void speak() //Creating the mrthod of speak
	{
		System.out.println("Student Detail : \nName : "+name+"\nAge : "+age);
	}
}

class Student extends Person  //Creating a child class 
{
	private String grade;
	Student(String name,int age,String grade)
	{
		super(name, age);  //Access the super class constructor
		this.grade=grade;
	}
	public void study()  //Creating the method of study
	{
		System.out.println("Grade : "+grade);
	}
}

public class PersonAndStudentInheritance 
{
	public static void main(String[] args) 
	{
		Student student=new Student("Ayesha",19,"A+"); //Creating a child class object
		student.speak();  //Call the speak method
		student.study();  //Call the study method 
	}

}