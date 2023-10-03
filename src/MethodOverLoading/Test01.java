package MethodOverLoading;
class Adder
{  
	static int add(int a,int b)
	{
		return a+b;
		}  
	static int add(int a,int b,int c)
	{
		return a+b+c;
		}  
	}  
public class Test01 { 
		public static void main(String[] args)
		{  
		System.out.println(Adder.add(1,1));  
		System.out.println(Adder.add(1,1,1));  
		}
}
