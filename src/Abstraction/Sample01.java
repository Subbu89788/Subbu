package Abstraction;
abstract class Bike{  
	  abstract void run();  
	}  
public class Sample01 extends Bike{
		void run()
		{
			System.out.println("running safely");
			}  
		public static void main(String args[]){  
		 Bike obj = new Sample01();  
		 obj.run();  
		}   

}
