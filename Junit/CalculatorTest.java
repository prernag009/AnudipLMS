package junit4package;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest
{
	@Test  
    public void testAdd()
	{   
		assertEquals(90,Calculator.add(23,67)); //Test method for addition
    }
	@Test  
    public void testSubtract()
	{  
		assertEquals(-54,Calculator.subtract(13,67)); //Test method for subtraction
    }
	@Test  
    public void testMultiply()
	{  
		assertEquals(78,Calculator.multiply(13,6)); //Test method for multiplication
    }
	@Test  
    public void testDivide()
	{ 
		//Test method for dividion.This method check the approximate value with a delta value 0.1
		assertEquals(2.0,Calculator.divide(8,4),0.1);
		assertEquals(0.0,Calculator.divide(0,4),0.1);
    }
	@Test
    public void testDivideByZero() 
	{
		//It checks if an exception is thrown when dividing by zero.
		try
		{
			Calculator.divide(5, 0); 
		}
        catch (ArithmeticException e)
		{
            assertEquals("Cannot divide by zero", e.getMessage()); 
        }
    }
}
