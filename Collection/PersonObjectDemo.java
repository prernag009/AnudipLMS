package collectionpackage;

import java.util.ArrayList;

//Declaring a Person Class
class Person
{
	private String name;
	private int age;
	//Constructor for Person class
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class PersonObjectDemo 
{
	public static void main(String[] args)
	{
		// Creating an ArrayList to store Person objects
		ArrayList<Person> list = new ArrayList<>();
		//Adding Person objects to the list
        list.add(new Person("Ashrat", 22));
        list.add(new Person("Sonali", 20));
        list.add(new Person("Nisha", 20));
        list.add(new Person("Hemanshu", 21));
        list.add(new Person("Saif", 21));
        list.add(new Person("Manisha", 20));
        list.add(new Person("Vishal", 19));
        list.add(new Person("Kiran", 24));
        list.add(new Person("Diya", 18));
        list.add(new Person("Deepak", 22));
        
        // Printing the Person objects using a for-each loop
        for (Person person : list)
            System.out.println(person);
	}
}
