package Abstraction;
abstract class State
{
	abstract void capital();
	public void District()
	{
		System.out.println("District got executed");
	}
	
}
abstract class Country extends State
{
	abstract void international();
	public void District1()
	{
		System.out.println("country got executed");
	}
}
class Foreign extends Country
{
	void capital()
	{
		System.out.println("Capital got executed");	
	}
	void international()
	{
		System.out.println("international got executed");	
	}
}

public class Sample005TNG {

	public static void main(String[] args) 
	{
		System.out.println("main got executed");	
		Foreign f1 = new Foreign();
		f1.capital();
		f1.District();
		f1.District1();
		f1.international();
		System.out.println("execution done");	
		
	}

}
