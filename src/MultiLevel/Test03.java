package MultiLevel;

public class Test03 extends Test01{

	public static void main(String[] args) {
		System.out.println("Execution  Started in child Class");
		Test03 t3 = new Test03();
		t3.Bicycle();
		t3.Bike();
		t3.bus();
		t3.Car();
		t3.Chopper();
		t3.Flight();
		System.out.println("Execution  ended in child Class");
		
	}

	public void Flight()
	{
		System.out.println("Flight executed in Child");
	}
	public void Chopper()
	{
		System.out.println("Chopper executed in Child");
	}
}
