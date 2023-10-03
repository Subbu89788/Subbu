package Interface;
interface Bag
{
	void books();
	static int price(int x)
	{
		return x*x;
	}
}
class Shop implements Bag
{
	public void books()
	{
		System.out.println("books get executed");
	}
}
public class Sample005TNG {

	public static void main(String[] args) {
		
		Bag  b1 = new Shop();
		b1.books();
		int r = Bag.price(3);
		System.out.println(r);
	}

}
