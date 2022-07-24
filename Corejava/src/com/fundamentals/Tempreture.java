package com.fundamentals;

import java.util.Scanner;

public class Tempreture {
	static Tempreture temp=new Tempreture();
	Scanner sc=new Scanner(System.in);
	float tempr;
	
	void getinput() {
		System.out.println("Enter tempin Celcius :");
		tempr=sc.nextFloat();
		
	}
	void convert_celcius_to_fahrenheit() {
		temp.getinput();
		float temprf=(tempr*1.8f)+32;
		
		System.out.println("Tempreture in Fahrenheit is :"+temprf);
		
	}
	void getinput1() {
		System.out.println("Enter tempin Fahrenheit :");
		tempr=sc.nextFloat();
		
	}
	
	void convert_fahrenheit_to_celcius() {
		temp.getinput1();
		float temprc=(tempr-32)*5/9f;
		
		System.out.println("Tempreture in Celcius is :"+temprc);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp.convert_celcius_to_fahrenheit();
		temp.convert_fahrenheit_to_celcius();
	}

}
