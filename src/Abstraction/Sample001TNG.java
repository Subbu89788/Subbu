package Abstraction;
abstract class Demo
{
	abstract public void test();
}
 class Sample extends Demo
 {
	 public void test()
	 {
		 System.out.println("Executing test Method");
	 }
	 
 }
public class Sample001TNG {

	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		s1.test();
	}

}
