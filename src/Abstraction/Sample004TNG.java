package Abstraction;
abstract class Forest
{
	abstract void Animals();
}
class Carnivores extends Forest
{
	void Animals()
	{
		System.out.println("The animal which eats Leafy veggies");
		
	}
}
class Herbivores extends Carnivores
{
	void Animals1()
	{
	System.out.println("The animal which eats Flesh of Anothe animals");
	
	}
	
}
public class Sample004TNG {

	public static void main(String[] args) {
		Herbivores h1 = new Herbivores();
		h1.Animals();
		h1.Animals1();

	}

}
