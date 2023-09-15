package MultiLevel;

public class Test02 {

	public static void main(String[] args) {
		Test02 t2 = new Test02();
		t2.Bicycle(); 
		t2.Bike();
	}

	public void Bicycle()
	{
		System.out.println("Bicycle executed in GrandParent");
	}
	public void Bike()
	{
		System.out.println("Bike executed in GrandParent");
	}
}
