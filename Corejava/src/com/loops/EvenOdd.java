package com.loops;

public class EvenOdd {
	static EvenOdd EvenOdd=new EvenOdd();
	int a;
	
	void evenNo() {
		System.out.println("Even no ");
		a=2;
		while(a<=100) {
			System.out.print(" "+a);
			a=a+2;
			
		}
	}
	void oddNo() {
		System.out.println("Odd no");
		a=1;
		while(a<=99) {
			System.out.print(" "+a);
			a=a+2;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd.evenNo();
		System.out.println("--------");
		EvenOdd.oddNo();
		
	}

}
