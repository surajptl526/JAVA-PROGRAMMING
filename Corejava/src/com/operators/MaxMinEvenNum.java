package com.operators;

import java.util.Scanner;

public class MaxMinEvenNum {
	static MaxMinEvenNum number=new MaxMinEvenNum();
	Scanner sc=new Scanner(System.in);
	
	int num1,num2,num3;
	
	void getInput() {
		System.out.println("Enter Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
	}
	
	void maxNum() {
		if (num1>num2){
		System.out.println("num1 isgraeter tahan num2");
		
		}
		else {
			System.out.println("num2 is graeter");
		}
	
	}
	void maxNum1() {
		System.out.println(num1>num2 ?"a is graeter tahn b":"b is graeter than a"); 
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number.getInput();
		number.maxNum();
		number.maxNum1();
	}

}
