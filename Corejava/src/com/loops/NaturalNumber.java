package com.loops;

import java.util.Scanner;

public class NaturalNumber {
	
	static NaturalNumber num=new NaturalNumber();
	Scanner sc=new Scanner(System.in);

	int number1;
	int i=1;
	void getInput() {
		System.out.println("Enter number");
		number1=sc.nextInt();
		
	}
	void natural() {
		while(i<=number1) {
			System.out.println(i);
			i++;
			
			
		}
	}
	void natural1() {
		i=number1;
		while(i>=1) {
			System.out.println(i);
			i--;
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num.getInput();
		num.natural();
		num.natural1();
	}

}
