package Abstraction;
abstract class Bikee{  
	   Bikee()
	   {
		   System.out.println("execution of bike is created");
		   }  
	   abstract void run();  
	   void changeGear()
	   {
		   System.out.println("execution of gear changed");
		   }  
	 }    
	 class Honda extends Bikee
	 {  
	 void run()
	 {
		 System.out.println("execution of running safely..");
		 }  
	 }  
public class Sample04 {
	public static void main(String args[]){  
		  Bikee o1 = new Honda();  
		  o1.run();  
		  o1.changeGear();  
		 }  

}
