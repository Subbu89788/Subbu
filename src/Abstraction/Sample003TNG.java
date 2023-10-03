package Abstraction;
abstract class Father
{
	abstract public void mother ();
	public void child()
	{
		System.out.println("Child is studying........");
	}
}

class Grandfather extends Father
{
	public void mother ()
	{
		System.out.println("Mother is studying........");
	}
	
}
public class Sample003TNG {
	public static void main(String[] args) {
		Grandfather g1 = new Grandfather();
		g1.child();
		g1.mother();
	}

}
