package SimpleCode;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Executed in Parent");
		Test1 t1 = new Test1();
		t1.engine();
		t1.Break();

	}
	
	public void engine()
	{
		System.out.println("engine executed in parent");
	}
	public void Break()
	{
		System.out.println("break executed in parent");
	}

}
