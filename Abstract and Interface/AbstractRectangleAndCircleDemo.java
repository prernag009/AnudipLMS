package abstractandinterfacepackage;

abstract class ShapeDemo  //Creating a abstract class
{
	protected final double pi=3.14;
	abstract void calculateArea();  //Creating a abstract method called calculateArea
}

class Circle extends ShapeDemo  //Creating a circle class inherits the abstract class
{
	private double radius;
	public Circle(double radius) //Create a circle class constructor
	{
		this.radius=radius;
	}
	public void calculateArea()   
	{
		System.out.println("Area of circle : "+(pi*radius*radius));  //Calculate the area of circle
	}
}

class Rectangle extends ShapeDemo  //Creating a rectangle class inherits the abstract class 
{
	private double length;
	private double breadth;
	public Rectangle(double length, double breadth)  //Create a rectangle class constructor
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void calculateArea() 
	{
		System.out.println("Area of Rectangle : "+(length*breadth));  //Calculate the area of rectangle
	}
}

public class AbstractRectangleAndCircleDemo 
{
	public static void main(String[] args) 
	{
		Circle circle=new Circle(3.6); //Creating a circle class object
        circle.calculateArea();  //Call a circle class method
		Rectangle rectangle=new Rectangle(2.4,5.4);  //Create a rectangle class object
		rectangle.calculateArea(); //Call a rectangle class method
	}
}
