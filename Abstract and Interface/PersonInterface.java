package abstractandinterfacepackage;

interface Person  //Creating a person interface
{
	void speak(); //creating a speak method
}

class Student implements Person  //Creating a student class implements person interface
{
	@Override
	public void speak() //Implements a speak method
	{
		System.out.println("Learning is fun!");
	}	
}

class Teacher implements Person //Creating a teacher class implements person interface
{
	@Override
	public void speak() //Implements a speak method
	{
		System.out.println("Education is important!");
	}
}

public class PersonInterface 
{
	public static void main(String[] args)
	{
		Student student=new Student(); //Creating a student class object
		student.speak();
		Teacher teacher=new Teacher(); //Creating a teacher class object
		teacher.speak();
	}
}