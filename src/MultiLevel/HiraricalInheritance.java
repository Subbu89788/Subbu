package MultiLevel;

class Animal
{  
	void eat()
	{
		System.out.println("eat get Executed...");
		}  
	}  
	class Dog extends Animal
	{  
	void bark()
	{
		System.out.println("bark get executed...");
		}  
	}  
	class Cat extends Animal
	{  
	void meow()
	{
		System.out.println("meow get executed...");
		}  
	}  
	class HiraricalInheritance {  
		public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		Dog d = new Dog();
		d.bark();
		d.eat();
		}
}
