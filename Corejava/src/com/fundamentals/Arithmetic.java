package com.fundamentals;

public class Arithmetic {
	
	int a=50, b=30,result=0;
	
	void addition() {
		result=a+b;
		System.out.println("Addition is :"+result);
		
	}
	void addition1() {
		a+=b;
		System.out.println("Addition is :"+a);
		
	}
	
	void subtraction() {
		
		result=a-b;
		System.out.println("Subtraction is :"+result);
		
	}
	void subtraction1() {
		
		a-=b;
		System.out.println("Subtraction is :"+a);
		
	}
	void multiplication() {
		
		result=a*b;
		System.out.println("Multiplication is :"+result);
			
	}
	void devidation() {
		
		result=a/b;
		System.out.println("Devidation is :"+result);
		
	}
	void logical() {
		if (a==b ||a>b);
		
		System.out.println("a is greater than b");
	}
	
	void logical1() {
		if (a!=b && a>b);
		
		System.out.println("a is greater than b");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;



		System.out.println(a==b); // false
		System.out.println(a>b); // false
		System.out.println(a<b); // true
		System.out.println(a>=b); // false
		System.out.println(a<=b);
		
		
		Arithmetic arithmetic=new Arithmetic();
		
		arithmetic.addition();
		arithmetic.addition1();
		arithmetic.subtraction();
		arithmetic.subtraction1();
		arithmetic.multiplication();
		arithmetic.devidation();
		arithmetic.logical();
		arithmetic.logical1();
		
		
	}

}
