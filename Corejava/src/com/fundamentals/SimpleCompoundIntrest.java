package com.fundamentals;

import java.util.Scanner;

public class SimpleCompoundIntrest {
	
	static SimpleCompoundIntrest simcomp=new SimpleCompoundIntrest();
	Scanner sc=new Scanner(System.in);
	double p;
	double t;
	double r;
	
	
	void getinput() {
		System.out.println("Enter Principle VALUE ");
		p=sc.nextDouble();
		
		System.out.println("Enter time period ");
		t=sc.nextDouble();
		
		System.out.println("Enter rate of intrest ");
		r=sc.nextDouble();
		
	}
		void simpleintrest() {
			double simintr=(p*t*r)/100;
			System.out.println("Simple Inteest is "+simintr);
			
		}
		
		void coumpintrest() {
			double coumpintr=p * Math.pow(1.0+r/100.0,t) - p;
			System.out.println("Simple Inteest is "+coumpintr);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simcomp.getinput();
		simcomp.simpleintrest();
		simcomp.coumpintrest();
		
	}

}
