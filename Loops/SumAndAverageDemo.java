package arraypackage;

import java.util.Scanner;

public class SumAndAverageDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];     //Creating a array of 5 integers
        for(int i=0;i<5;i++)
        {
        	System.out.print("Enter a number : ");
        	arr[i]=sc.nextInt();
        }
        System.out.print("Numbers in array are : ");   //Print the numbers in array
        for(int i=0;i<arr.length;i++) 
        	System.out.print(arr[i]+" ");
        
        int sum=0;
        double avg=0;
        for(int i=0;i<arr.length;i++)
        {
        	sum+=arr[i];     //Calculate the sum of numbers
        	avg=(double)sum/5;   //Calculate the average of numbers
        }
        System.out.println("\nSum of values in the array : "+sum);  //Print the sum of values in the array
        System.out.println("Average of values in the array : "+avg);  //Print the average of values in the array
        sc.close();
	}
}
