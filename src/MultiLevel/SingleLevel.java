package MultiLevel;
class Zoo
{  
	public void eat()
	{
		System.out.println("eats got executed...");
		}  
}  
	class pet extends Zoo{  
	void bark()
	{
		System.out.println("dogss are barking...");
	}  
}  
public class SingleLevel {

	public static void main(String args[])
	{  
	pet p=new pet();  
	p.bark();  
	p.eat();
	}

}
