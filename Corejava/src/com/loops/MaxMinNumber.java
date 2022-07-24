package com.loops;

import java.util.Scanner;

public class MaxMinNumber {
	
	static MaxMinNumber ifels=new MaxMinNumber();
	Scanner sc=new Scanner(System.in);
	
	int num1;
	int num2;
	int num3;
	
	
	public void getinput1() {
		System.out.println("Enter number1:");
		num1=sc.nextInt();
		System.out.println("Enter number2:");
		num2=sc.nextInt();
	}
		
		public void getinput2() {
		System.out.println("Enter number1:");
		num1=sc.nextInt();
		System.out.println("Enter number2:");
		num2=sc.nextInt();
		System.out.println("Enter number3:");
		num3=sc.nextInt();
		
		
	}
	void maxNumberFrm2num() {
		ifels.getinput1();
		if (num1>num2) {
			System.out.println("Greater number from two number is num1");
		}
		else {
		System.out.println("Greater number from two number is num2");
		}
			
		
	}
		void maxNumberFrm3num() {
			ifels.getinput2();
			if(num1>=num2 && num1>=num3) { 
				System.out.println("Greater number from three number is num1");
			}
				else if (num2>=num1&& num2>=num3) {
			System.out.println("Greater number from three number is num2");
				}
			else if(num3>=num1 && num3>=num2) {
				System.out.println("Greater number from three number is num3");
			}
			
			else {
				System.out.println("all numbers are equal or zero");
			}
			
			}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ifels.maxNumberFrm2num();
		ifels.maxNumberFrm3num();
		
	}

}
