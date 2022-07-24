package com.loops;

import java.util.Scanner;

public class SumOfNumbers {
	
	static SumOfNumbers sumnum=new SumOfNumbers();
	Scanner sc=new Scanner(System.in);
	int n;
	int i;
	int result;
	int result1;
	int result2;
	int temp;
	
	
	
	void getInput() {
		System.out.println("Enter Natural number");
		n=sc.nextInt();
		}
	void addition() {
		for(i=1;i<=n;i++) {
			result=result+i;
		}
		System.out.println("Additiopn of natural numbers is "+result);
				
			
		
	}
	void additionEven() {
		for(i=2;i<=n;i=i+2) {
			result1=result1+i;
			
			}
		System.out.println("Additiopn of natural Even numbers is "+result1);
				
	}
	
	void additionOdd() {
		for(i=1;i<=n;i=i+2) {
			result2=result2+i;
			
			}
		System.out.println("Additiopn of natural Even numbers is "+result2);
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumnum.getInput();
		sumnum.addition();
		sumnum.additionEven();
		sumnum.additionOdd();
	}

}
