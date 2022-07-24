package com.fundamentals;

import java.util.Scanner;

public class Convert {
	
	static Convert con=new Convert();
	Scanner sc=new Scanner(System.in);
	double  length;
	
	void getInpout() {
		System.out.println("Enter length in Centimeter :");
		length=sc.nextDouble();
				
	}
	void convert_cm_to_meter(){
		con.getInpout();
		double meter=length/100;
		System.out.println("Length in meter is :"+meter);
			
	}
	void convert_cm_to_km(){
		con.getInpout();
		double km=length/1000;
		System.out.println("Length in kilometer is :"+km);
			
	}
	
	void close() {
		sc.close();
		
	}
	
	;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		con.convert_cm_to_meter();
		con.convert_cm_to_km();
		

	}

}
