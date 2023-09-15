package SimpleCode;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static boolean isArmstrong(int n)   
	{   
	int temp, digits=0, last=0, sum=0;   
	temp=n;   
	
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}   
	temp = n;   
	while(temp>0)   
	{        
	last = temp % 10;   
	sum +=  (Math.pow(last, digits));     
	temp = temp/10;   
	}   
	if(n==sum)    
	return true;        
	else return false;   
	}    
	public static void main(String[] args) {    
		int num;   
		Scanner sc= new Scanner(System.in);  
		System.out.println("Enter the number: ");  
		num=sc.nextInt();  
		if(isArmstrong(num))  
		{  
		System.out.print("Given number is an Armstrong number ");  
		}  
		else   
		{  
		System.out.print("Given number is not an Armstrong number ");  
		}  
		}  

}
