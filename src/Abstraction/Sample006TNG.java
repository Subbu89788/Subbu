package Abstraction;
abstract class Gender
{
	
	void male()
	{
		System.out.println("Male got executed ");
	}
}
class Female extends Gender 
{
	void boy()
	{
		System.out.println("boy got executed ");
	}
	
}

public class Sample006TNG {

	public static void main(String[] args) {
		Female g1 = new Female();
		g1.male();
		g1.boy();

	}

}
