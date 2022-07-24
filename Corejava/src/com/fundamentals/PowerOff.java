package com.fundamentals;

import java.util.Scanner;

public class PowerOff {
	
	static PowerOff pof=new PowerOff();
	Scanner sc= new Scanner(System.in);
	int b;
	int e;
	int r=1;
	int i=1;
	
	
	 void getinput() {
		
		System.out.println("Enter the base value : ");
		b=sc.nextInt();
		
		
		System.out.println("Enter the Exponential : ");
		e=sc.nextInt();
		
		
	}
	
	void poweroff() {
		
		pof.getinput();

		
		while (i<=e)
		{
		
		 r*=b;
		 
		i++;
		
		

		}
		System.out.println("Power off base value:" +r);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pof.poweroff();
		}

}
