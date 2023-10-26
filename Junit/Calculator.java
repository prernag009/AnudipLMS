package junit4package;

public class Calculator 
{
	//Creating a method to add two integers
	public static int add(int a,int b) 
	{
		return a+b;
	}
	//Creating a method to subtract one integer from another
	public static int subtract(int a,int b) 
	{
		return a-b;
	}
	//Creating a method to multiply two integers
	public static int multiply(int a,int b) 
	{
		return a*b;
	}
	//Creating a method to divide one integer by another
	public static double divide(int a,int b)
	{
		if(b==0)
			throw new ArithmeticException("Cannot divide by zero"); // Throws an arithmetic exception
		return (double)a/b;
	}
}
