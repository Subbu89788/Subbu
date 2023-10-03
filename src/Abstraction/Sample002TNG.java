package Abstraction;
abstract class Super
{
	abstract public void run();
	abstract public void walk();
}
class Move extends Super
{
	public void run()
	{
		System.out.println("run method is executing");
	}
	public void walk()
	{
		System.out.println("walk method is executing");
	}
	
}


public class Sample002TNG {

	public static void main(String[] args) {
		Move m1 = new Move();
		m1.run();
		m1.walk();

	}

}
