package Abstraction;
abstract class village
{
	abstract public void Trees();
}
class Town extends village
{
	public void Trees()
	{
		System.out.println("Trees are present in the town");
	}
	
}
class City extends village
{
	public void Trees()
	{
		System.out.println("Trees are present in the city");
	}
	
}

public class Sample03TNG {

	public static void main(String[] args) {
		City c1 = new City();
		Town t1 = new Town();
		c1.Trees();
		t1.Trees();

	}

}
