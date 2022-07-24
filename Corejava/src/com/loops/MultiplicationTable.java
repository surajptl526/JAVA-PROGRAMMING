package com.loops;

import java.util.Scanner;

public class MultiplicationTable {
	
	static MultiplicationTable multitable=new MultiplicationTable();
	Scanner sc=new Scanner(System.in);
	int a;
	int i;
	int result;
	
	
	void getInput() {
		System.out.println("Multiplication table of  number");
		a=sc.nextInt();
	}
	
	void table() {
	
		for(i=1;i<=10;i++) {
			result=a*i;
			System.out.println(result);
			
		}
	}
	 
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multitable.getInput();
		multitable.table();
	}

}
