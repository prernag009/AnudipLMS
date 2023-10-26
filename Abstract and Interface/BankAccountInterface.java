package abstractandinterfacepackage;

interface BankAccount1  //Creating a interface
{
	//Creating the deposit and withdraw methods
	void deposit(double amount);  
	void withdraw(double amount);  
}

class CheckingAccount1 implements BankAccount1  //Creating a checkingaccount class which implements the interface
{
	private double balance;
	private String accountNumber;
	public CheckingAccount1(String accountNumber, double balance)  //Creating a CheckingAccount constructor
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	@Override
	public void deposit(double amount)
	{
		this.balance+=amount;  //Add a amount in the current balance
		System.out.println("Account detail after the deposit amount :\nAccount Number : "+accountNumber+"\nBalance : "+this.balance);
	}
	@Override
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

public class BankAccountInterface 
{
	public static void main(String[] args)
	{
		CheckingAccount1 account = new CheckingAccount1("4422349",15000);  //Creating a CheckingAccount class object
		//Call the deposit and withdraw methods
		account.deposit(9000); 
		account.withdraw(1550);
		account.withdraw(22000); 
	}

}
