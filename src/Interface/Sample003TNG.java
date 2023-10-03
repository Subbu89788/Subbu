package Interface;
interface Lion
{
	void roar();
}
interface Dog
{
	void bark();
}
	
public class Sample003TNG  implements Lion,Dog
{
	public void roar()
	{
		System.out.println("Lion is executed ");
	}
	public void bark()
	{
		System.out.println("dog is executed ");
	}
	public static void main (String args[]) 
	{
		Sample003TNG e = new Sample003TNG();
	e.roar();
	e.bark();
		
	}
}
	
