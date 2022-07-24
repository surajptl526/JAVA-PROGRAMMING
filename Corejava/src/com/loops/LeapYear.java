package com.loops;

import java.util.Scanner;

public class LeapYear {
	
	static LeapYear lp=new LeapYear();
	Scanner sc=new Scanner(System.in);
	double year;
	
	void getinput() {
		System.out.println("Enter year ");
		year=sc.nextDouble();
		
	}
	void leapyear() {
		if (year %4==0) {
			System.out.println("Entered year is Leap Year");
		}
		else {
			System.out.println("Entered year is not Leap Year");
		}
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lp.getinput();
		lp.leapyear();
	}

}
