package MultiLevel;
class Animal
{  
	void eat()
	{
		System.out.println("eats got executed...");
		}  
}  
	class Dog extends Animal{  
	void bark()
	{
		System.out.println("dogss are barking...");
	}  
}  

public class SingleInheritance 
{	
		public static void main(String args[])
		{  
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
		}
} 
