package stringpackage;

public class StringBasic
{
	public static void main(String[] args)
	{
		//Creating a object of StringBuffer class
		StringBuffer sb=new StringBuffer("This is StringBuffer");
		sb.append("- This is a sample program"); //Append a string to the stringbuffer
		System.out.println(sb);
		
		sb.insert(20, " Object"); //Inserting a string at a specific position
		System.out.println(sb);
		
		sb.reverse(); //Reversing the content of the stringbuffer
		System.out.println(sb);
		
		sb.reverse();
		sb.replace(14,20,"Builder"); //Replacing a substring
		System.out.println(sb);
	}
}
