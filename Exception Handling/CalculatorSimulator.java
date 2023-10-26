package exceptionhandlingpackage;

class CountryNotValidException extends Exception
{
	private static final long serialVersionUID = 1L;
	private String message;
	// Constructor for CountryNotValidException
	CountryNotValidException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString() 
	{
		return message;
	}
}

class EmployeeNameInvalidException extends Exception
{
	private static final long serialVersionUID = 1L;
	private String message;
	// Constructor for EmployeeNameInvalidException
	EmployeeNameInvalidException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString() 
	{
		return message;
	}
}

class TaxNotEligibleException extends Exception
{
	private static final long serialVersionUID = 1L;
	private String message;
	// Constructor for TaxNotEligibleException
	TaxNotEligibleException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString()
	{
		return message;
	}
}

class TaxCalculator
{
	public static String taxAmount;
	// Method to calculate tax amount
	public static double calculateTax(String empName,boolean isIndian,double empSal)
			throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException 
	{
		// Checking if the employee is an Indian citizen
		if (!isIndian)
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		 // Checking if the employee name is empty
		if (empName.isEmpty())
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		
		double taxAmount=0;
		// Calculating tax based on salary range
		if(empSal>100000) 
			taxAmount=empSal *8/100;
		else if(empSal>=50000 && empSal<=100000) 
			taxAmount=empSal *6/100;
		else if(empSal>=30000 && empSal<=50000) 
			taxAmount =empSal *5/100;
		else if(empSal>=10000 && empSal<=30000)
			taxAmount =empSal *4/100;
		else
			throw new TaxNotEligibleException("The employee does not need to pay tax");
			
		return taxAmount;
	}
}

public class CalculatorSimulator 
{
	public static void main(String[] args)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
	{
		//Try to calculate the tax amount
		try
		{
			double cal=TaxCalculator.calculateTax("Prerna",true,2000);
		    System.out.println("Tax amount is " + cal);
		} 
		//Catch the multiple exception after thrown by try block
		catch(CountryNotValidException e1)
		{
			System.out.println("Exception caught :"+e1);
		}
		catch(EmployeeNameInvalidException e2)
		{
			System.out.println("Exception caught :"+e2);
		}
		catch(TaxNotEligibleException e3)
		{
            System.out.println("Exception caught :"+e3);
		}
	}
}
