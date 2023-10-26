package collectionpackage;

import java.util.HashMap;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		// Creating a HashMap with keys of type String and values of type Integer
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		// Adding key-value pairs to the HashMap
		hm.put("A", 45);
		hm.put("D", 78);
		hm.put("P", 23);
		// Printing the content of the HashMap
		System.out.println("Content of hashmap :"+hm); 
	}
}
