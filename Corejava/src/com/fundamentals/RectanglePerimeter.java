package com.fundamentals;

import java.util.Scanner;

public class RectanglePerimeter {
	
	static RectanglePerimeter rp=new RectanglePerimeter();

	
	Scanner sc=new Scanner(System.in);
	
	int lenght;
	int width;
	
	
	public void getnput(){
		
		System.out.println("Please enter lenght :");
		lenght=sc.nextInt();
		
		System.out.println("Please enter Width :");
		width=sc.nextInt();
		  // sc.close();
		   
	}
	public void perimeter(){
		rp.getnput();
		int perm=2*(lenght +  width);
		
		System.out.println("perimeter is :"+perm);
		
		
	}
	public void area() {
		rp.getnput();
		int area=lenght*width;
		System.out.println("Area is "+area);
		
	}
	
	public void close() {
		sc.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	rp.perimeter();
	rp.area();
	rp.close();
	
	
			
	}
	
	

}
