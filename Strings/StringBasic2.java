package stringpackage;

public class StringBasic2 
{
	public static void main(String[] args)
	{
		String s1="Welcome to Java World"; //Creating a string
		char s2=s1.charAt(4); //Getting a character at 5th position
		System.out.println("Character at 5th position : "+s2+"\n");
		
		String s3="Welcome"; //Comparing s1 with s3 ignoring case
		Boolean result=s1.equalsIgnoreCase(s3);
		if(result==true)
			System.out.println("Match");
		else
			System.out.println("Not Match");
		
		String s4="- Let us learn"; 
		String r2=s1.concat(s4); //Concatenating s1 with s4
		System.out.println("\nConcatenates the string : "+r2+"\n");
		
		String s5="a";
		int index=r2.indexOf(s5); //Finding the position of the first occurrence of character 'a' in 'r2'
		System.out.println("Position of the first occurrences of character 'a' : "+index+"\n");
		
		String s6=r2.replace('a', 'e'); //Replacing all occurrences of 'a' with 'e' in 'r2'
		System.out.println("Replaces all the occurrences of ‘a’ character with the new ‘e’ :\n"+s6+"\n");
		
		String s7=s6.substring(3, 10); // Extracting a substring from 4th to 10th position in 'r2'
		System.out.println("String between 4th position and 10th position : "+s7+"\n");
		
		String s8=s6.toLowerCase(); // Converting the string to lowercase
		System.out.println("Converting the string into lowercase : "+s8);
	}
}
