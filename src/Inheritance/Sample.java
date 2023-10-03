package Inheritance;
class Zoo
{  
	public void eat()
	{
		System.out.println("eats got executed...");
		}  
}  
	class Pet extends Zoo{  
	void bark()
	{
		System.out.println("dogss are barking...");
	}  
}  
public class Sample {

		public static void main(String args[])
		{  
		Pet d=new Pet();  
		d.bark();  
		d.eat();  
		}

}
