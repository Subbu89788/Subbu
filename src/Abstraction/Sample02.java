package Abstraction;
abstract class Shape
{  
abstract void draw();  
}  
class Rectangle extends Shape
{  
void draw()
{
	System.out.println("executing the drawing rectangle");
	}  
}  
class Circle1 extends Shape
{  
void draw()
{
	System.out.println("executing the drawing circle");
	}  
}  
public class Sample02 {

	public static void main(String[] args) 
	{
		Shape s=new Circle1();
		s.draw();  
		}  

}
