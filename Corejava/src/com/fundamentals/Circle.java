package com.fundamentals;

import java.util.Scanner;

public class Circle {
	
	static Circle cr=new Circle();
	Scanner sc=new Scanner(System.in);
	
	float radius;
	
	public void getinput() {
		
		System.out.println("Enter Radius");
		radius=sc.nextFloat();
		
	}
	
	public void diameter(){
		cr.getinput();
		float diameter=2*radius;
		System.out.println("Diamneter of Circle is :"+diameter);
			
	}
	
	public void circumferance(){
		cr.getinput();
		float circumferance=(float) (2*3.14*radius);
		System.out.println("Circumferance of Circle is :"+circumferance);
		
	
	}
	
	public void area(){
		cr.getinput();
		float area=(float) (2*3.14*radius);
		System.out.println("Area of Circle is :"+area);
			
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		cr.diameter();
		cr.circumferance();
		cr.area();
	}

}
