package Inheritance;
class A
{
	public int i = 10;
}
class B extends A
{
	public int z= 100;
	
}
class C extends B
{
	public int g = 400;
	public void display1()
	{
		System.out.println(i);
		System.out.println(z);
		System.out.println(g);
	}
}
public class MultiLevelTNG {
	public static void main (String[]args)
	{
		System.out.println("Execution Starts....");
		C b1 = new C();
		b1.display1();
		System.out.println("Execution ends....");
		
	}

}
