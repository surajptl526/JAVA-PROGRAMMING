package com.switchcase;

import java.util.Scanner;

public class MonthdayWeekDay {
	static MonthdayWeekDay day=new MonthdayWeekDay();
	Scanner sc=new Scanner(System.in);
	
	int weekday;
	int monthnumber;
	
	void getInput() {
		System.out.println("Enter the weekday from 1-7");
		weekday=sc.nextInt();
		System.out.println("Enter the monthnumber");
		monthnumber=sc.nextInt();
	}
	
	void weekDay() {
		switch(weekday) {
		case 1:
			System.out.println("The weekday is Monday");
			break;
		case 2:
			System.out.println("The weekday is Tuesday");
			break;
		case 3:
			System.out.println("The weekday is Wensday");
			break;
		case 4:
			System.out.println("The weekday is Thursady");
			break;	
		case 5:
			System.out.println("The weekday is Friday");
			break;	
		case 6:
			System.out.println("The weekday is Saturady");
			break;	
		case 7:
			System.out.println("The weekday is Sunday");
			break;
		}
	}
	void monthDay() {
		switch (monthnumber) {
		case 2:
			System.out.println("Number if days in month are 28");
			break;
		case 1:
		case 3:
		case 5:
		case 7:	
		case 8:
		case 10:
		case 12:
			System.out.println("Number if days in month are 31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number if days in month are 30");
			break;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day.getInput();
		day.monthDay();
		day.weekDay();
		
	}

}
