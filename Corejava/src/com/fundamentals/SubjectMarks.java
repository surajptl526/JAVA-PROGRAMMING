package com.fundamentals;

import java.util.Scanner;

public class SubjectMarks {
	
	static SubjectMarks submark=new SubjectMarks();
	
	Scanner sc=new Scanner(System.in);
	
	float maths;
	float marathi;
	float science;
	float history;
	
	
	
	void getinput() {
		System.out.println("Enter marks of Maths :   ");
		maths=sc.nextInt();
		System.out.println("Enter marks of Marathi :   ");
		marathi=sc.nextInt();
		System.out.println("Enter marks of Science :   ");
		science=sc.nextInt();
		System.out.println("Enter marks of History :   ");
		history=sc.nextInt();
		
	}
	void addition() {
		float marks_toatl=maths+marathi+history+science;
		System.out.println("Total marks of All subject :   "+ marks_toatl);
			
	}
	void average() {
		float average_asub=(maths+marathi+history+science)/4;
		System.out.println("Average of marks of All subject :   "+average_asub);
			
	}
	void percentage() {
		
		
		float percentage_asub=(float) ((maths+marathi+history+science)/400*100);
		System.out.println("Percentage of marks of All subject :   "+percentage_asub);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		submark.getinput();
		submark.addition();
		submark.average();
		submark.percentage();
	
	}

}
