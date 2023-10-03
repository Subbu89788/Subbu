package Inheritance;
class Zooo
{  
	public void eat()
	{
		System.out.println("eats got executed...");
		}  
}  
	class Pett extends Zooo
	{  
	void bark()
	{
		System.out.println("dogss are barking...");
	}  
}  
public class Single 
{	
	public static void main(String args[])
	{  
	Pett d=new Pett();  
	d.bark();  
	d.eat();  
	}
} 