package Inheritance;
class Parent1
{
	public void love()
	{
		System.out.println("love towaards parents1");
		
	}
}
	class parent2 
	{
		public void love()
		{
			System.out.println("love towaards parent2");
			
		}
	}
	

public class MultipleTNG extends Parent1,parent2
{
		public void love()
		{
			System.out.println("love towaards child");	
		}
	}
	public static void main(String[] args) {
		MultipleTNG c1 = new MultipleTNG();
		c1.love();
	}

}
