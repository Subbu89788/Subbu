package MultiLevel;

public class Test01 extends Test02 {

	public static void main(String[] args) {
		Test01 t1 = new Test01();
		t1.bus();
		t1.Car();
		t1.Bicycle();
		t1.Bike();
	}
	public void bus()
	{
		System.out.println("bus executed in parent");
	}
	public void Car()
	{
		System.out.println("Car executed in parent");
	}


}
