package com.fundamentals;

public class DaysConversion {
	static DaysConversion daysConv=new DaysConversion();
	
	double days=800;
	void convert_days_to_years() {
		double years= days/365;
		System.out.println("800 Days is equal to years is :"+years);
		
	}
	void convert_days_to_month() {
		double month=days/30;
		System.out.println("800 Days is equal to Month is :"+month);
		 
	}
	
	void convert_days_to_week() {
		double week=days/7;
		System.out.println("800 Days is equal to Week is :"+week);
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daysConv.convert_days_to_years();
		daysConv.convert_days_to_month();
		daysConv.convert_days_to_week();
		
	}

}
