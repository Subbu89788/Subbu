package Inheritance;
class Parent
{
	public int i = 10;
}
class Child1 extends Parent
{
	public int z= 100;
	public void display1()
	{
		System.out.println(i);
		System.out.println(z);
		
	}
	
}
class Child2 extends Parent
{
	public int g = 400;
	public void display2()
	{
	System.out.println(i);
	System.out.println(g);
	}
}
public class HierarchicalTNG
{
	public static void main (String[]args)
	{
		System.out.println("Execution Starts....");
		Child2 b1 = new Child2();
		b1.display2();
		System.out.println("Execution ends....");
		
		System.out.println("Execution Starts child 1....");
		Child1 b2 = new Child1();
		b2.display1();
		System.out.println("Execution ends child 1....");
		
	}
	

}
