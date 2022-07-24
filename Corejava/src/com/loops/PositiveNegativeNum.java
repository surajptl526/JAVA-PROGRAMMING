package com.loops;

import java.util.Scanner;

public class PositiveNegativeNum {
	static PositiveNegativeNum posnegv=new PositiveNegativeNum();
	Scanner sc=new Scanner(System.in);
	
	double a,result;
	
	void getinput() {
		System.out.println("Enter number :");
		a=sc.nextDouble();
		}
	void postivnegtv() {
		if(a<0) {
			System.out.println("Entered number is negative");
		}
		else if(a>0){
			System.out.println("Entered number is Positive");	
			
		}
		else {
			System.out.println("Entered number is zero");
		}
		
	}
	
	void postivnegtv1() {
		System.out.println("Entered number you want to check :"+a);
		result=Math.signum(a);
		System.out.println(result);
		
	}
	
	void evenodd() {
		if (a%2==0) {
			System.out.println("Entered number is even number");
		}
		else{
				System.out.println("Entered number is odd number");
			}
		}
		
	void divisibleby() {
		if(a%5==0 && a%11==0) {
			System.out.println("Entered number is divisible by 5 & 11 :");	
		}
		else {
			System.out.println("Entered number is not divisible by 5 & 11 :");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		posnegv.getinput();
		posnegv.postivnegtv();
		posnegv.postivnegtv1();
		posnegv.evenodd();
		posnegv.divisibleby();
	}

}
