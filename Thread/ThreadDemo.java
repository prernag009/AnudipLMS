package threadpackage;

//Thread for calculating the average of first 10 numbers
class AverageThread extends Thread
{
	public void run()
	{
		int sum=0;
		double avg=0;
		for(int i=1;i<=10;i++) 
		{
			sum+=i;
			avg=(double)sum/10;		
		}
		System.out.println("Average of first 10 numbers :"+avg);
	}
}

//Thread for calculating and printing squares of numbers
class SquareThread extends Thread
{
	public void run()
	{
		int arr[]= {1,20,50,15,30};
		for(int num : arr)
			System.out.println("Square of "+num+" is :"+(num*num));
	}
}

public class ThreadDemo 
{
	public static void main(String[] args)
	{
		 // Create an instance of AverageThread
		AverageThread at=new AverageThread();
		at.start(); //start the average thread
		try {
			at.join(); //wait for the average thread to finish
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//Create an instance of SquareThread
		SquareThread st=new SquareThread();
		st.start(); //Start the square thread 
	}
}
