package collectionpackage;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo2
{
	public static void main(String[] args)
	{
		// Creating a HashMap with keys of type String and values of type String
		HashMap<String,String> hm=new HashMap<String,String>();
		//Creating a scanner object for input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many object :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
   			System.out.print("Enter a key as string :");
   		    String key=sc.next();
   		    System.out.print("Enter a value as integer :");
   		    sc.nextLine();
   		    String value=sc.nextLine();
   		    hm.put(key,value);
   		}
		//Printing the content of hashmap
		System.out.println("Content of hashmap are :"+hm);
		//Closing the scanner
		sc.close();
	}
}
