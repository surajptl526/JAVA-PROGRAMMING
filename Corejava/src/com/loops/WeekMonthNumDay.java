package com.loops;

import java.util.Scanner;

public class WeekMonthNumDay {
	static WeekMonthNumDay day=new WeekMonthNumDay();
	Scanner sc=new Scanner(System.in);
	
	int weekday;
	int monthday;
	
	void getInput() {
		System.out.println("ENTER weekday number 1-7");
		weekday=sc.nextInt();
		System.out.println("ENTER Month number");
		monthday=sc.nextInt();
		
	}
	void weekDay() {
		if(weekday==1) {
			System.out.println("Weekday is Monday");
			}
		else if(weekday==2) {
			System.out.println("Weekday is Tuesday");
			}
		else if(weekday==3) {
			System.out.println("Weekday is Wensday");
			}
		else if(weekday==4) {
			System.out.println("Weekday is Thursday");
			}
		else if(weekday==5) {
			System.out.println("Weekday is Friday");
			}
		else if(weekday==6) {
			System.out.println("Weekday is Saturday");
			}
		else if(weekday==7) {
			System.out.println("Weekday is Sunday");
			}
		else{
			System.out.println("You have entered wron input Please ENTER weekday number 1-7");
			}
		
	}
	void monthday() {
		if(monthday==1) {
			System.out.println("No of days in Month are 31  ");
			}
		else if(monthday==2) {
			System.out.println("No of days in Month are 28  ");
			}
				
		else if(monthday>2 && monthday%2==0) {
			System.out.println("No of days in Month are 30  ");
			}
		else {
			System.out.println("No of days in Month are 31");
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day.getInput();
		day.weekDay();
		day.monthday();
		
		
	}

}
