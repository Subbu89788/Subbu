package Interface;
interface Demmo1
{
	void test();
}
class Demo3 implements Demmo1
{
	public void test()
	{
		System.out.println("haiii");
	}
}
public class Sample011TNG {
	
		public static void main(String args[]) {
		
		Demo3 d1 = new Demo3();
		d1.test();
	}
	}
