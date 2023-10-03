package Interface;

interface sample{  
	void test();  
	}  
	interface Demo extends sample
	{  
	void part();
	}  
public class InterfaceToInterface implements Demo{
		public void test()
		{
			System.out.println("test part of interface to interface is executed...");
			}  
		public void part()
		{
			System.out.println("part of interface to interface is to be executed...");
			}  
		  public static void main(String args[])
		  {  
			  InterfaceToInterface I1 = new InterfaceToInterface();  
		I1.test();  
		I1.part();  
		 } 

	}
