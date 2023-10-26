package inheritancepackage;

class Vehicle   //Creating a Parent class
{
	private String brand;
	private String model;
	private int year;
	Vehicle(String brand,String model,int year)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	public void drive()   //Creating the method of drive
	{
		System.out.println("Vehicle Details :\nBrand Name : "+brand+"\nModel Name : "+model+"\nYear : "+year);
	}
}

class Car extends Vehicle  //Creating a Child class
{
	private String color;
	Car(String model, String brand, int year,String color)
	{
		super(brand,model,year);  //Access the parent class constructor
		this.color=color;
	}
	public void honk()  //Creating the method of honk
	{
		System.out.println("Color of a car model : "+color);
	}
	
}

public class VehicleAndCarDemo 
{
	public static void main(String[] args)
	{
		Car car=new Car("Renault","Clio",2001,"White");   //Creating a child class object
		car.drive();   //Call the drive method 
		car.honk();   //Call the honk method 
	}

}