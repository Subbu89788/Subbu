package Inheritance;
class Animals
{  
	void Lion()
	{
		System.out.println("lion got executed...");
		}  
}  
	class cat extends Animals
	{  
	void pet()
	{
		System.out.println("pet got executed...");
	}
	}
  
	class Tiger extends cat
	{  
	void weep()
	{
		System.out.println("weep got executed...");
		}  
	}  
public class Multi {
		public static void main(String args[])
		{  
		Tiger d=new Tiger();  
		d.weep();  
		d.Lion();
		d.pet(); 
		}
}
