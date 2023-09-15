package SimpleCode;

public class Test2 extends Test1{

	public static void main(String[] args) {
		System.out.println("executed in child");
		Test2 t2 = new Test2();
		t2.tyres();
		t2.rpm();
		t2.engine();
		t2.Break();
	}

	public void tyres()
	{
		System.out.println("tyres executed in child");
	}
	public void rpm()
	{
		System.out.println("rpm executed in child");
	}

}
