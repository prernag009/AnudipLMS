package classpackage;

import java.util.Scanner;

public class AdditionOfTwoNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  //Create a scanner object for input
        System.out.print("Enter a first number : ");
        int n1=sc.nextInt(); //
        System.out.print("Enter a second number : ");
        int n2=sc.nextInt();
        System.out.print("Sum of two numbers : "+(n1+n2)); //Calculate the sum of two numbers
        sc.close();
	}
}
