package com.switchcase;

import java.util.Scanner;

public class MaxMinNum {
	
	static MaxMinNum num=new MaxMinNum();
	Scanner sc=new Scanner(System.in);
	int a,b;
	
	void getInput() {
		System.out.println("Enter numer");
		a=sc.nextInt();
		b=sc.nextInt();
		
	}
	void  maxMinNum() {
		if (a>b) {
			System.out.println("ais graeter tahn b");
		}
		else {
			System.out.println("b is greater taan a");
		}
		
		switch(a & b)
		{
		case (a>b):
			
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
