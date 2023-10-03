package Interface;

interface Test1{  
void test();  
}  
interface Test2{  
void part();  
}  

public class MultiLevel implements Test1,Test2
{
	
	public void test()
	{
		System.out.println("test 02 is executed...");
		}  
	public void part()
	{
		System.out.println("part 02 is to be executed...");
		}  
	  public static void main(String args[])
	  {  
		  MultiLevel m1 = new MultiLevel();  
	m1.test();  
	m1.part();  
	 } 

}
