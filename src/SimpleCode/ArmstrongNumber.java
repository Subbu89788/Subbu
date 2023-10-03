package SimpleCode;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static boolean isArmstrong(int n)   
	{   
	int t, d=0, l=0, s=0;   
	t=n;   
	
	while(t>0)    
	{   
	t = t/10;   
	d++;   
	}   
	t = n;   
	while(t>0)   
	{        
	l = t % 10;   
	s +=  (Math.pow(l, d));     
	t = t/10;   
	}   
	if(n==s)    
	return true;        
	else return false;   
	}    
	public static void main(String[] args) {    
		int num;   
		Scanner s1= new Scanner(System.in);  
		System.out.println("Enter the number: ");  
		num=s1.nextInt();  
		if(isArmstrong(num))  
		{  
		System.out.print("Given number "+num+" is an Armstrong number ");  
		}  
		else   
		{  
		System.out.print("Given number "+num+ " is not an Armstrong number ");  
		}  
		}  

}
