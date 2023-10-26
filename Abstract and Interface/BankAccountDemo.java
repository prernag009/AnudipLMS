package abstractandinterfacepackage;

abstract class BankAccount  //Creating a abstract class
{
	protected String accountNumber;
	protected double balance;
	abstract void deposit(double amount);  //Creating a abstract method
	abstract void withdraw(double amount);  //Creating a another abstract method
}

class CheckingAccount extends BankAccount  //Creating a checkingaccount class
{
	public CheckingAccount(String accountNumber, double balance)  //Creating a CheckingAccount constructor
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void deposit(double amount)
	{
		this.balance+=amount;  //Add the deposit amount
		System.out.println("Account detail after the deposit amount :\nAccount Number : "+accountNumber+"\nBalance : "+this.balance);
	}
	public void withdraw(double amount)
	{
		if(this.balance>=amount) //Calculate a withdraw account
		{
			this.balance-=amount;
			System.out.println("Account detail after the withdraw amount :\nAccount Number : "+accountNumber+"\nBalance : "+this.balance);
		}
		else
			System.out.println("Insuffient Amount");
	}
}

public class BankAccountDemo
{
	public static void main(String[] args) 
	{
		CheckingAccount account = new CheckingAccount("34522349",12000);  //Creating a CheckingAccount class object
		//Call the deposit and withdraw methods
		account.deposit(5000); 
		account.withdraw(550);
		account.withdraw(12000); 
	}
}