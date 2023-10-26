package arraypackage;

import java.util.Scanner;

public class ArrayDemo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];   //Creating a array of 10 integers
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter a number : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Numbers in array are : ");  //Print the numbers in array
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");

		int largest = arr[0],smallest = arr[0];  //Initializes the largest and smallest variable
		for (int i = 0; i<arr.length; i++) 
		{
			if(arr[i]>largest)   // Calculate the largest values in the array
				largest = arr[i];    
			else if(arr[i]<smallest)  // Calculate the smallest values in the array
				smallest = arr[i];
		}
		System.out.println("\nSmallest number in array : "+smallest);	
		System.out.println("Largest number in array : "+largest);
		sc.close();
	}

}
